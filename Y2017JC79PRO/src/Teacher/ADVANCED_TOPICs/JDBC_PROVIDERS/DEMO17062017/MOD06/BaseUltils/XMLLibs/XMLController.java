package BaseUltils.XMLLibs;

public class XMLController<E> {
	private XMLModel m_objXMLModel;
	public XMLController() {
		m_objXMLModel = new XMLModel();
	}
	
	 /***
	  * Nghiệp vụ xử lý dữ liệu với XML Database Files
	  * @param bOpt = 0: Read XML  <List<List<Hashmap>>>
	  * @param bOpt = 1: Update XML <Boolean>
	  * @param bOpt = 2: Write XML <Boolean>
	  * @return E Object
	 * @throws Exception 
	  */
	 public E XMLExecute(XMLParams objXMLParam ,byte bOpt) 
			 	throws Exception{
		 E objE = null;
		 if(m_objXMLModel == null)
			 m_objXMLModel = new XMLModel();
		 switch (bOpt) {
		 		case 0: objE = (E) m_objXMLModel.
							ReadElements(objXMLParam); break;
		 		case 1: objE = (E) m_objXMLModel.
		 					UpdateElements(objXMLParam); break;
		 		case 2: objE = (E) m_objXMLModel.
		 					WriteElements(objXMLParam); break;
		 	}
		 	return objE; 
	 }
}
