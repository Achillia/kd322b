import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class XML {
	private Document doc;
	private ArrayList<Program> programsList;

	public XML (String fileName){
		doc = null;
		try {
			File fXmlFile = new File(fileName);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	    public String getRoot(){
	    	return doc.getDocumentElement().getNodeName();
	    }


	    private ArrayList<Program> loadAllPrograms() {
	    	ArrayList<Program> output = new ArrayList<Program>();

	    	NodeList programs = doc.getElementsByTagName("Program");
	    	for (int i = 0; i < programs.getLength(); i++) {

	    		Node node = programs.item(i);
	    		Element elm = (Element) node;

	    		String name = elm.getElementsByTagName("name").item(0).getTextContent();
	    		String code = elm.getElementsByTagName("code").item(0).getTextContent();
	    		int women = Integer.parseInt(elm.getElementsByTagName("women").item(0).getTextContent());
	    		int men = Integer.parseInt(elm.getElementsByTagName("men").item(0).getTextContent());
	    		
	    		
	    		Program program = new Program(name, code, women, men);
	    		output.add(program);
	    	}
	    	return output;
	    	
	    }
	    
	    public ArrayList<Program> getProgramsList(){
	    	programsList = loadAllPrograms();
	    	return programsList;
	    }
	    
	    
}