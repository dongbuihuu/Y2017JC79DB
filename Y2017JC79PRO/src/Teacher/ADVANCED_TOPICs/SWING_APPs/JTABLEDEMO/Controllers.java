package JAVACORE_TRAINING.ADVANCED_TOPICs.SWING_APPs.JTABLEDEMO;

import java.util.List;

public class Controllers<T, E> {
	private Models<T> m_objModel;
	public Controllers() {
		m_objModel = new Models<>();
	}
	
	public E ExecuteOf(List<T> lisT) 
											throws Exception{
		if(m_objModel == null)
			m_objModel = new Models<>();
		return (E) m_objModel.ConvertListTtoDTM(lisT);
	}
}
