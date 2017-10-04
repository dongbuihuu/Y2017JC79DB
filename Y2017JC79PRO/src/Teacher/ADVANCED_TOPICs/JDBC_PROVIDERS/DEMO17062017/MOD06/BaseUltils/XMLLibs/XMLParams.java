package BaseUltils.XMLLibs;

import java.util.List;

/***
 * - List<T> lisT : Danh sách các Field
 * - List<List<Object>> lisListObject: Danh sách dữ liệu 2 chiều
 * - List<Object> lisObject: Danh sách dữ liệu 1 chiều
 * - String sRootNode: Thông tin về Node gốc
 * - String sAttributeKey: Thông tin về thuộc tính định danh
 * - String sElementNode: Thông tin về ElementNode thuộc của RootNode
 * - String sPathFile: Đường dẫn tới file *.xml
 * - boolean isWriteType: Kiểu ghi dữ liệu True --> Ghi mới; False --> Ghi nối tiếp
 * @param <T>
 */
public class XMLParams<T> {
	public List<T> lisField;                  						
	public List<List<Object>> lisListObject;   
	public List<Object> lisObject;                     
	public String sRootNode;                            
	public String sAttributeKey;                     
	public String sElementNode;                     
	public String sPathFile;                              
	public boolean isWriteType; 
}
