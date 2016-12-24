package cn.com.fangself.soft;

import java.util.ArrayList;
import java.util.List;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

class XmlFuncForGoodsInfo {

	public XmlFuncForGoodsInfo() {
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
    public static boolean addXML(String filePath,GoodsInfo goods){  
        try{  
            //读取传入的路径，返回一个document对象  
            Document document = XmlFunction.loadInit(filePath);  
            //创建叶节点  
            Element Goods = document.createElement("Goods");
           Element ID = document.createElement("Gname");  
            Element PWD = document.createElement("GID");//创建叶节点的第一个元素  
            Element IDCardInfo = document.createElement("Gprice");//创建叶节点的第二个元素  
            Element RegitStock = document.createElement("Gamount");//创建叶节点的第三个元素  
            Element GoodsKindsNum = document.createElement("Gremain");//创建叶节点的第四个元素  
            
            Text ID_ = document.createTextNode(goods.Gname);
            /*UUID.randomUUID().toString()*///);//创建叶节点的第一个元素下的文本节点  
            ID.appendChild(ID_);//把该文本节点加入到叶节点的第一个元素里面  
            Text PWD_ = document.createTextNode(String.valueOf(goods.GID));//创建叶节点的第二个元素下的文本节点  
            PWD.appendChild(PWD_);//把该文本节点加入到叶节点的第二个元素里面  
            Text IDCardInfo_ = document.createTextNode(String.valueOf(goods.Gprice));//创建叶节点的第三个元素下的文本节点  
            IDCardInfo.appendChild(IDCardInfo_);//把该文本节点加入到叶节点的第三个元素里面  
            Text RegitStock_ = document.createTextNode(String.valueOf(goods.Gamount));//创建叶节点的第四个元素下的文本节点  
            RegitStock.appendChild(RegitStock_);//把该文本节点加入到叶节点的第四个元素里面  
            Text GoodsKindsNum_ = document.createTextNode(String.valueOf(goods.Gremain));//创建叶节点的第四个元素下的文本节点  
            GoodsKindsNum.appendChild(GoodsKindsNum_);//把该文本节点加入到叶节点的第四个元素里面  
            //把叶节点下的元素加入到叶节点下  
            Goods.appendChild(ID);  
            Goods.appendChild(PWD);  
            Goods.appendChild(IDCardInfo);  
            Goods.appendChild(RegitStock);
            Goods.appendChild(GoodsKindsNum);   
            
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
    public static List<GoodsInfo> selectXML(String filePath){  
         List<GoodsInfo> clientValueList = new ArrayList<GoodsInfo>();  
         try{  
             //读取传入的路径，返回一个document对象  
             Document document = XmlFunction.loadInit(filePath);  
             //获取叶节点  
             NodeList nodeList = document.getElementsByTagName("Goods");  
             //遍历叶节点  
            // System.out.println("节点数目："+nodeList.getLength());
             for(int i=0; i<nodeList.getLength(); i++){  
            	 
            	 GoodsInfo clients = new GoodsInfo();  
                 String ID_ = document.getElementsByTagName("Gname").item(i).getFirstChild().getNodeValue();  
                 String PWD_ = document.getElementsByTagName("GID").item(i).getFirstChild().getNodeValue();  
                 String IDCardInfo_ = document.getElementsByTagName("Gprice").item(i).getFirstChild().getNodeValue();  
                 float RegitStock_ = Float.parseFloat(document.getElementsByTagName("Gamount").item(i).getFirstChild().getNodeValue());  
                 int GoodsKindsNum_ = Integer.parseInt(document.getElementsByTagName("Gremain").item(i).getFirstChild().getNodeValue());
                 
                 clients.setGname(ID_);
                 clients.setGID(Integer.parseInt(PWD_));
                 clients.setGprice(Float.parseFloat(IDCardInfo_));
                 clients.setGamount((int)(RegitStock_));
                 clients.setGremain(GoodsKindsNum_);
                 
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
  
  
  



