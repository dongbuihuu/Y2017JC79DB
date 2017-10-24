package Teacher.OOP_CONCEPT.XMLMODULES.XML_EXCERCISES;

public class XMLController<E> {
	private XMLModel m_objXMLModel;

	public XMLController() {
		m_objXMLModel = new XMLModel();
	}

	/***
	 * Nghiệp vụ xử lý dữ liệu với XML Database Files
	 * 
	 * @param bOpt
	 *            = 0: Read XML
	 * @param bOpt
	 *            = 1: Update XML
	 * @param bOpt
	 *            = 2: Write XML
	 * @return E Object
	 * @throws Exception
	 */
	public E XMLExecute(XMLParams objXMLParam, byte bOpt) throws Exception {
		E objE = null;
		if (m_objXMLModel == null)
			m_objXMLModel = new XMLModel();
		switch (bOpt) {
		case 0:
			objE = (E) m_objXMLModel.ReadElements(objXMLParam);
			break;
		case 1:
			objE = (E) m_objXMLModel.UpdateElements(objXMLParam);
			break;
		case 2:
			objE = (E) m_objXMLModel.WriteElements(objXMLParam);
			break;
		}
		return objE;
	}
}
