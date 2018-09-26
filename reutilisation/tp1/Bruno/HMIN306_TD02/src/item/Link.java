package item;

public class Link extends FilesystemItem {
	
		protected DataObject data  ;
		
		public Link() {
			this.data = new DataObject();
			this.data.setName("MySpecialName");
		}
		
		public int getSize(){
			data = this.getData();
			return data.content.length();
		}
		
		public String getName(){
			data = this.getData();
			return data.name;
		}
		
		public void setContent(String content) {
			data = this.getData();
			data.content = content;
		}
		
		public DataObject getData() {
			return this.data;
		}
		
		public void someOtherMethod() {
		}
}