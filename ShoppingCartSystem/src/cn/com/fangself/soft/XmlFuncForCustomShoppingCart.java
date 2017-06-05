package cn.com.fangself.soft;

import java.util.ArrayList;
import java.util.List;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

class XmlFuncForCustomshoppingCart {

	public XmlFuncForCustomshoppingCart() {
		// TODO Auto-generated constructor stub
	}
  
    
    /** 
     * 添加节点 
     * @param filePath 
     * @return 
     * *
     *  String ID;
	 *  String PWD;
     */  
    public static boolean addXML(String filePath,CustomshoppingCart custom){  
        try{  
             //读取传入的路径，返回一个document对象  
             Document document = XmlFunction.loadInit(filePath);  
             //创建叶节点  
             Element Goods = document.createElement("Goods");
             Element cust = document.createElement("CustomInfo");
             Element custId = document.createElement("ID");
             Element custPWD = document.createElement("PWD");
             Element ID = document.createElement("Gname");  
             Element PWD = document.createElement("Gamount");//创建叶节点的第一个元素  
             Element IDCardInfo = document.createElement("Gprice");//创建叶节点的第二个元素  
             Element RegitStock = document.createElement("GID");//创建叶节点的第三个元素  
             
             Text custId_ = document.createTextNode(custom.customer.ID);
             custId.appendChild(custId_);
             Text custPWD_ =document.createTextNode(custom.customer.PWD);
             custPWD.appendChild(custPWD_);
             Text ID_ = document.createTextNode(custom.Gname);
             /*UUID.randomUUID().toString()*///);//创建叶节点的第一个元素下的文本节点  
             ID.appendChild(ID_);//把该文本节点加入到叶节点的第一个元素里面  
             Text PWD_ = document.createTextNode(String.valueOf(custom.Gamount));//创建叶节点的第二个元素下的文本节点  
             PWD.appendChild(PWD_);//把该文本节点加入到叶节点的第二个元素里面  
             Text IDCardInfo_ = document.createTextNode(String.valueOf(custom.Gprice));//创建叶节点的第三个元素下的文本节点  
             IDCardInfo.appendChild(IDCardInfo_);//把该文本节点加入到叶节点的第三个元素里面  
             Text RegitStock_ = document.createTextNode(String.valueOf(custom.GID));//创建叶节点的第四个元素下的文本节点  
             RegitStock.appendChild(RegitStock_);//把该文本节点加入到叶节点的第四个元素里面  
             //Text CustomInfos = document.createTextNode(String.valueOf(goods.Gremain));//创建叶节点的第四个元素下的文本节点  
             //把叶节点下的元素加入到叶节点下  
             
             cust.appendChild(custId);
             cust.appendChild(custPWD);
             Goods.appendChild(cust);
             Goods.appendChild(ID);  
             Goods.appendChild(PWD);  
             Goods.appendChild(IDCardInfo);  
             Goods.appendChild(RegitStock);
                
            
            //获取根节点  
            Element eltRoot = document.getDocumentElement();  
            //把叶节点加入到根节点下  
            eltRoot.appendChild(Goods);  
            //更新修改后的源文件  
            XmlFunction.saveXML(document, filePath);  
            return true;  
        }catch(Exception e){  
            e.printStackTrace();  
            System.out.println(e.getMessage());  
            return false;  
        }  
    }  
   
    /** 
     * 获取xml文件的所有记录 
     * @param filePath 
     * @return 
     * String ID;
	String PWD;
	String IDCardInfo;
	float RegitStock;
	int GoodsKindsNum;
     */  
    public static List<CustomshoppingCart> selectXML(String filePath){  
         List<CustomshoppingCart> clientValueList = new ArrayList<CustomshoppingCart>();  
         try{  
             //读取传入的路径，返回一个document对象  
             Document document = XmlFunction.loadInit(filePath);  
             //获取叶节点  
             NodeList nodeList = document.getElementsByTagName("Clients");  
             //遍历叶节点  
            // System.out.println("节点数目："+nodeList.getLength());
             for(int i=0; i<nodeList.getLength(); i++){  
            	 
            	 CustomshoppingCart clients = new CustomshoppingCart();  
            	// String ID_ = document.getElementsByTagName("CustomInfo").item(i).getFirstChild().getNodeValue();  
                 String PWD_ = document.getElementsByTagName("Gmount").item(i).getFirstChild().getNodeValue();  
                 String IDCardInfo_ = document.getElementsByTagName("Gprice").item(i).getFirstChild().getNodeValue();  
                 float RegitStock_ = Integer.parseInt(document.getElementsByTagName("GID").item(i).getFirstChild().getNodeValue());  
                 
                // clients.setGname(ID_);
                 clients.setGID(Integer.parseInt(PWD_));
                 clients.setGprice(Float.parseFloat(IDCardInfo_));
                 clients.setGamount((int)(RegitStock_));
                 
                 clientValueList.add(clients);
             }  
             return clientValueList;  
         }catch(Exception e){  
             e.printStackTrace();  
             System.out.println(e.getMessage());  
             return null;  
         }  
    }  
}  
  
  
  



