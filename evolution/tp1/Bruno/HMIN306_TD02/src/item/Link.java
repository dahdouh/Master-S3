package item;

public class Link extends FilesystemItem implements fsi2 {
	
		protected DataObject data  ;
		
		public Link() {
			this.data = new DataObject();
			this.data.setName("MySpecialName");
		}
		
		/* (non-Javadoc)
		 * @see item.fsi2#getSize()
		 */
		@Override
		public int getSize(){
			data = this.getData();
			return data.content.length();
		}
		
		/* (non-Javadoc)
		 * @see item.fsi2#getName()
		 */
		@Override
		public String getName(){
			data = this.getData();
			return data.name;
		}
		
		/* (non-Javadoc)
		 * @see item.fsi2#setContent(java.lang.String)
		 */
		@Override
		public void setContent(String content) {
			data = this.getData();
			data.content = content;
		}
		
		public DataObject getData() {
			return this.data;
		}
		
		/* (non-Javadoc)
		 * @see item.fsi2#someOtherMethod()
		 */
		@Override
		public void someOtherMethod() {
		}
}