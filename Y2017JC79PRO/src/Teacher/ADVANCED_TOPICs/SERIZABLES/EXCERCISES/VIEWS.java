package JAVACORE_TRAINING.ADVANCED_TOPICs.SERIZABLES.EXCERCISES;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class VIEWS extends JFrame {

    private final JPanel contentPane;
    private final JTable jtbLoadData;
    private List<Student> lisStudent;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    VIEWS frame = new VIEWS();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public VIEWS() {
        setResizable(false);
        lisStudent = new ArrayList<Student>();

        setTitle("CHƯƠNG TRÌNH ĐỌC - GHI ĐỐI TƯỢNG XUỐNG FILES");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 541, 436);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnXemTT = new JButton("Xem Thông Tin");
        btnXemTT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                // A - CÁCH 01:
                // 1. Khai báo và khởi tạo thông tin đối tượng                
                 /*if(lisStudent == null){ 
                         lisStudent = new  ArrayList<Student>(); 
                  } 
                 Student objSV01 = new Student();
                 Student objSV02 = new Student(); 
                 Student objSV03 = new Student();
                
                 objSV01.setiRollNo(100);
                 objSV01.setsFullName("Hoàng Văn Mạnh"); 
                 objSV01.setdMark(8.5);
                 
                 objSV02.setiRollNo(200);
                 objSV02.setsFullName("Phạm Văn Dương"); 
                 objSV02.setdMark(9.5);
                 
                 objSV03.setiRollNo(300); 
                 objSV03.setsFullName("Trần Văn Hùng");
                 objSV03.setdMark(10);
                  
                 //2. Đưa các objects vào 
                 lisStudent.add(objSV01);
                 lisStudent.add(objSV02); 
                 lisStudent.add(objSV03);
                  
                 //3. Định nghĩa ListField 
                 List<String> lisField = new ArrayList<String>();                  
                 lisField.add("RollNo");
                 lisField.add("FullName"); 
                 lisField.add("Mark");
                  
                 //4. Duyệt tập bản ghi --> đưa vào Vector
                 List<Vector<String>> lisRow = new ArrayList<Vector<String>>(); 
                 Vector<String> row = null;
                 for(int i = 0;i<lisStudent.size();i++){ 
                     row = new Vector<String>();
                     row.addElement(""+lisStudent.get(i).getiRollNo());
                     row.addElement(""+lisStudent.get(i).getsFullName());
                     row.addElement(""+lisStudent.get(i).getdMark());
                     lisRow.add(row); 
                 }
                
                 //5. Khai báo và khởi tạo đối tượng DefaultTableModel
                 DefaultTableModel objDTM = new DefaultTableModel();
                  
                 //6. Khai báo và khởi tạo đối tượng CONTROLLERS 
                 CONTROLLERS objController = new CONTROLLERS(); 
                 try { 
                     objDTM = objController.getModelInfo(lisField, lisRow); 
                 } catch(Exception e) {
                         e.printStackTrace();
                 }                  
                 //7. Hiển thị ra ngoài JTable 
                 jtbLoadData.setModel(objDTM);  */

                // B - CÁCH 02:
                JFileChooser objFile = new JFileChooser();
                objFile.setCurrentDirectory(new java.io.File("."));
                objFile.setDialogTitle("Chọn file: ");
                objFile.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
                String[] EXTENSION = new String[] { "dat", "tmp" };
                FileNameExtensionFilter filter = new FileNameExtensionFilter("DAT or TMP files", EXTENSION);
                objFile.setFileFilter(filter);
                objFile.setMultiSelectionEnabled(false);

                int returnVal = objFile.showOpenDialog(getParent());
                String ParentPath = "";
                String FileName = "";
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    ParentPath = objFile.getSelectedFile().getParent();
                    FileName = objFile.getSelectedFile().getPath();
                }

                // 2. Khai báo và khởi tạo đối tượng Controllers
                CONTROLLERS<Student> objController = new CONTROLLERS<Student>();

                // 3. Ghi thông tin xuống files *.DAT
                
                    if (lisStudent == null) {
                        lisStudent = new ArrayList<Student>();
                    }
                    try {
						lisStudent = objController.ReadListObjects(FileName);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					
                    // 3. Định nghĩa ListField
                   List<String> lisField = new ArrayList<String>();
                    lisField.add("RollNo");
                    lisField.add("FullName");
                    lisField.add("Mark");

                    // 4. Duyệt tập bản ghi --> đưa vào Vector
                    List<Vector<String>> lisRow = new ArrayList<Vector<String>>();
                    Vector<String> row = null;
                    for (int i = 0; i < lisStudent.size(); i++) {
                        row = new Vector<String>();
                        row.addElement("" + lisStudent.get(i).getiRollNo());
                        row.addElement("" + lisStudent.get(i).getsFullName());
                        row.addElement("" + lisStudent.get(i).getdMark());
                        lisRow.add(row);
                    }

                    // 5. Khai báo và khởi tạo đối tượng DefaultTableModel
                    DefaultTableModel objDTM = new DefaultTableModel();
                   // CONTROLLERS<Student> objController = new CONTROLLERS<Student>();
                    // 6. Khai báo và khởi tạo đối tượng CONTROLLERS
                    try {
                        objDTM = objController.getModelInfo(lisStudent);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    } catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                    // 7. Hiển thị ra ngoài JTable
                    jtbLoadData.setModel(objDTM);
            }
        });
        btnXemTT.setBackground(Color.ORANGE);
        btnXemTT.setFont(new Font("Cambria", Font.PLAIN, 14));
        btnXemTT.setBounds(10, 11, 146, 37);
        contentPane.add(btnXemTT);

        JButton btnGhiTT = new JButton("Ghi Thông Tin ra files DAT");
        btnGhiTT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                // 1. Cung cấp cho người dùng tiện ích lựa chọn vị trí lưu files
                JFileChooser objFile = new JFileChooser();
                objFile.setCurrentDirectory(new java.io.File("."));
                objFile.setDialogTitle("Chọn file: ");
                objFile.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
                String[] EXTENSION = new String[] { "dat", "txt" };
                FileNameExtensionFilter filter = new FileNameExtensionFilter("DAT or TXT files", EXTENSION);
                objFile.setFileFilter(filter);
                objFile.setMultiSelectionEnabled(false);

                int returnVal = objFile.showSaveDialog(getParent());
                String ParentPath = "";
                String FileName = "";
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    ParentPath = objFile.getSelectedFile().getParent();
                    FileName = objFile.getSelectedFile().getName();
                    // JOptionPane.showMessageDialog(getParent(), ParentPath);
                    // JOptionPane.showMessageDialog(getParent(),
                    // objFile.getSelectedFile().getName());
                }

                // 2. Khai báo và khởi tạo đối tượng Controllers
                CONTROLLERS<Student> objController = new CONTROLLERS<Student>();

                // 3. Ghi thông tin xuống files *.DAT
                boolean bFlag = false;
                try {
                    bFlag = objController.WriteListObjects(lisStudent, FileName);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                if (bFlag) {
                    JOptionPane.showMessageDialog(getParent(), "Đã ghi files tại: [" + ParentPath + FileName + "]");
                } else {
                    JOptionPane.showMessageDialog(getParent(), "Ghi files thất bại!");
                }
            }
        });
        btnGhiTT.setFont(new Font("Cambria", Font.PLAIN, 14));
        btnGhiTT.setBackground(Color.ORANGE);
        btnGhiTT.setBounds(166, 11, 219, 37);
        contentPane.add(btnGhiTT);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 59, 505, 328);
        contentPane.add(scrollPane);

        jtbLoadData = new JTable();
        scrollPane.setViewportView(jtbLoadData);
    }
}
