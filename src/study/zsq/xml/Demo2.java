package study.zsq.xml;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

//使用dom方式对xml的读取
public class Demo2 {

	
	@Test
	public void read() throws ParserConfigurationException, SAXException, IOException{
		DocumentBuilderFactory factory = 
			DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse("src/study/zsq/xml/book.xml");
		
		//得到根节点
		Node root = document.getElementsByTagName("书架").item(0);
		
		list(root);
	}
	
	@Test
	public void read1() throws ParserConfigurationException, SAXException, IOException{
		DocumentBuilderFactory factory = 
			DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse("src/study/zsq/xml/book.xml");
		
		//得到根节点
		Element root = (Element) document.getElementsByTagName("书架").item(0);
		String value  = root.getAttribute("name");
		System.out.println(value);
		
	}

	private void list(Node node) {
		System.out.println(node.getNodeName());
		NodeList list = node.getChildNodes();
		for (int i = 0; i < list.getLength(); i++) {
			Node child = list.item(i);
			list(child);
		}
	}
}
