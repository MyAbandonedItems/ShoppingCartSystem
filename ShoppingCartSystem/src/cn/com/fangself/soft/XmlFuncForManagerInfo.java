package cn.com.fangself.soft;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

class XmlFuncForManagerInfo {

	public XmlFuncForManagerInfo() {
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
    public static boolean addXML(String filePath,CustomInfo custom){  
        try{  
            //读取传入的路径，返回一个document对象  
            Document document = XmlFunction.loadInit(filePath);  
            //创建叶节点  
            Element Custom = document.createElement("Customs");
           Element ID = document.createElement("ID");  
            Element PWD = document.createElement("PWD");//创建叶节点的第一个元素  
            
            
            Text ID_ = document.createTextNode(custom.ID);
            /*UUID.randomUUID().toString()*///);//创建叶节点的第一个元素下的文本节点  
            ID.appendChild(ID_);//把该文本节点加入到叶节点的第一个元素里面  
            Text PWD_ = document.createTextNode(custom.PWD);//创建叶节点的第二个元素下的文本节点  
           PWD.appendChild(PWD_);
            //把叶节点下的元素加入到叶节点下  
            Custom.appendChild(ID);  
            Custom.appendChild(PWD);  
            
            //获取根节点  
            Element eltRoot = document.getDocumentElement();  
            //把叶节点加入到根节点下  
            eltRoot.appendChild(Custom);  
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
    public static List<ManagerInfo> selectXML(String filePath,ManagerInfo client){  
         List<ManagerInfo> clientValueList = new ArrayList<ManagerInfo>();  
         try{  
             //读取传入的路径，返回一个document对象  
             Document document = XmlFunction.loadInit(filePath);  
             //获取叶节点  
             NodeList nodeList = document.getElementsByTagName("Managers");  
             //遍历叶节点  
            // System.out.println("节点数目："+nodeList.getLength());
             for(int i=0; i<nodeList.getLength(); i++){  
            	 
            	 ManagerInfo clients = new ManagerInfo();  
                 String ID_ = document.getElementsByTagName("ID").item(i).getFirstChild().getNodeValue();  
                 String PWD_ = document.getElementsByTagName("PWD").item(i).getFirstChild().getNodeValue();  
                  
                 clients.setID(ID_);
                 clients.setPWD(PWD_);
                 
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
  
  
  



