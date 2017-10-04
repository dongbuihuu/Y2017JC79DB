package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.INHERISTANCES;

public class LopConMeo extends LopDongVat {
		public boolean isDuoi;
		
		public LopConMeo(){
			
		}
		
		public LopConMeo(boolean isChan, boolean isMat, boolean isDuoi){
			//super.setChan(isChan);
			//super.setMat(isMat);
			super(isChan, isMat);
			this.isDuoi = isDuoi;		    
		}
		
		@Override
		protected String TiengKeu() {
		// TODO Auto-generated method stub
		return super.TiengKeu();
		}
}	
