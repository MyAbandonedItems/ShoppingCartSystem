package cn.com.fangself.soft;



import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

class XmlFuncForClientInfo {

	public XmlFuncForClientInfo() {
		// TODO Auto-generated constructor stub
	}
  
    /** 
     * 添加节点 
     * @param filePath 
     * @return 
     *     * String ID;
	String PWD;
	String IDCardInfo;
	float RegitStock;
	int GoodsKindsNum;
     */  
    public static boolean addXML(String filePath,ClientInfo client){  
        try{  
            //读取传入的路径，返回一个document对象  
            Document document = XmlFunction.loadInit(filePath);  
            //创建叶节点  
            Element Clients = document.createElement("Clients");
           Element ID = document.createElement("ID");  
            Element PWD = document.createElement("PWD");//创建叶节点的第一个元素  
            Element IDCardInfo = document.createElement("IDCardInfo");//创建叶节点的第二个元素  
            Element RegitStock = document.createElement("RegitStock");//创建叶节点的第三个元素  
            Element GoodsKindsNum = document.createElement("GoodsKindsNum");//创建叶节点的第四个元素  
            
            
            Text ID_ = document.createTextNode(client.ID);
            /*UUID.randomUUID().toString()*///);//创建叶节点的第一个元素下的文本节点  
            ID.appendChild(ID_);//把该文本节点加入到叶节点的第一个元素里面  
            Text PWD_ = document.createTextNode(client.PWD);//创建叶节点的第二个元素下的文本节点  
            PWD.appendChild(PWD_);//把该文本节点加入到叶节点的第二个元素里面  
            Text IDCardInfo_ = document.createTextNode(client.IDCardInfo);//创建叶节点的第三个元素下的文本节点  
            IDCardInfo.appendChild(IDCardInfo_);//把该文本节点加入到叶节点的第三个元素里面  
            Text RegitStock_ = document.createTextNode(String.valueOf(client.RegitStock));//创建叶节点的第四个元素下的文本节点  
            RegitStock.appendChild(RegitStock_);//把该文本节点加入到叶节点的第四个元素里面  
            Text GoodsKindsNum_ = document.createTextNode(String.valueOf(client.GoodsKindsNum));//创建叶节点的第四个元素下的文本节点  
            GoodsKindsNum.appendChild(GoodsKindsNum_);//把该文本节点加入到叶节点的第四个元素里面  
            //把叶节点下的元素加入到叶节点下  
            Clients.appendChild(ID);  
            Clients.appendChild(PWD);  
            Clients.appendChild(IDCardInfo);  
            Clients.appendChild(RegitStock);
            Clients.appendChild(GoodsKindsNum); 
            //获取根节点  
            Element eltRoot = document.getDocumentElement();  
            //把叶节点加入到根节点下  
            eltRoot.appendChild(Clients);  
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
    public static List<ClientInfo> selectXML(String filePath){  
         List<ClientInfo> clientValueList = new ArrayList<ClientInfo>();  
         try{  
             //读取传入的路径，返回一个document对象  
             Document document = XmlFunction.loadInit(filePath);  
             //获取叶节点  
             NodeList nodeList = document.getElementsByTagName("Clients");  
             //遍历叶节点  
            // System.out.println("节点数目："+nodeList.getLength());
             for(int i=0; i<nodeList.getLength(); i++){  
            	 
            	 ClientInfo clients = new ClientInfo();  
                 String ID_ = document.getElementsByTagName("ID").item(i).getFirstChild().getNodeValue();  
                 String PWD_ = document.getElementsByTagName("PWD").item(i).getFirstChild().getNodeValue();  
                 String IDCardInfo_ = document.getElementsByTagName("IDCardInfo").item(i).getFirstChild().getNodeValue();  
                 float RegitStock_ = Float.parseFloat(document.getElementsByTagName("RegitStock").item(i).getFirstChild().getNodeValue());  
                 int GoodsKindsNum_ = Integer.parseInt(document.getElementsByTagName("GoodsKindsNum").item(i).getFirstChild().getNodeValue());
                 
                 clients.setID(ID_);
                 clients.setPWD(PWD_);
                 clients.setIDCardInfo(IDCardInfo_);
                 clients.setRegitStock(RegitStock_);
                 clients.setGoodsKindsNum(GoodsKindsNum_);
                 
                 clientValueList.add(clients);
             }  
             return clientValueList;  
         }catch(Exception e){  
             e.printStackTrace();  
             System.out.println(e.getMessage());  
             return null;  
         }  
    }  
    
    public static ClientInfo selectXMLByID(String filePath,String ThisID){  
        ClientInfo clientValueList = new ClientInfo();  
        try{  
            //读取传入的路径，返回一个document对象  
            Document document = XmlFunction.loadInit(filePath);  
            //获取叶节点  
            NodeList nodeList = document.getElementsByTagName("Clients");  
            //遍历叶节点  
           // System.out.println("节点数目："+nodeList.getLength());
            for(int i=0; i<nodeList.getLength(); i++){  
           	 
           	    String ID_ = document.getElementsByTagName("ID").item(i).getFirstChild().getNodeValue();
                if(ThisID.equals(ID_)){
                	String PWD_ = document.getElementsByTagName("PWD").item(i).getFirstChild().getNodeValue();  
                	String IDCardInfo_ = document.getElementsByTagName("IDCardInfo").item(i).getFirstChild().getNodeValue();  
                	float RegitStock_ = Float.parseFloat(document.getElementsByTagName("RegitStock").item(i).getFirstChild().getNodeValue());  
                	int GoodsKindsNum_ = Integer.parseInt(document.getElementsByTagName("GoodsKindsNum").item(i).getFirstChild().getNodeValue());
                	clientValueList.ID=ThisID;
                	clientValueList.PWD=PWD_;
                	clientValueList.IDCardInfo=IDCardInfo_;
                	clientValueList.RegitStock=RegitStock_;
                	clientValueList.GoodsKindsNum=GoodsKindsNum_;
                }
               
            }  
            return clientValueList;  
        }catch(Exception e){  
            e.printStackTrace();  
            System.out.println(e.getMessage());  
            return null;  
        }  
   }  
    
}  
  
  
  



