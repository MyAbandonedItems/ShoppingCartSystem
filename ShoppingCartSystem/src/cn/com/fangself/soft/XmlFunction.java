package cn.com.fangself.soft;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;

class XmlFunction {

	public XmlFunction() {
		// TODO Auto-generated constructor stub
	}
	  //读取传入的路径，返回一个document对象  
    public static Document loadInit(String filePath){  
        Document document = null;  
        try{  
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
            DocumentBuilder builder = factory.newDocumentBuilder();  
            document = builder.parse(new File(filePath));  
            document.normalize();  
            return document;  
        }catch(Exception e){  
            e.printStackTrace();  
            System.out.println(e.getMessage());  
            return null;  
        }  
    }  
    
    /** 
     * 把修改后的document写进源文件（更新源文件） 
     * @param document 
     * @param filePath 
     * @return 
     */  
    public static boolean saveXML(Document document,String filePath){  
        try{  
            TransformerFactory tFactory = TransformerFactory.newInstance();  
            Transformer transformer = tFactory.newTransformer();  
              
            DOMSource source = new DOMSource(document);  
            StreamResult result = new StreamResult(new File(filePath));  
            transformer.transform(source, result);  
            return true;  
        }catch(Exception e){  
            e.printStackTrace();  
            System.out.println(e.getMessage());  
            return false;  
        }  
    }  
      
}
