package library;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.getInt;
import javax.swing.table.DefaultTableModel;



public class dashboard extends javax.swing.JFrame {
    boolean radio;
    public dashboard() {
        initComponents();
        groupButton();
        bookstable.setAutoCreateRowSorter(true);
        p_table.setAutoCreateRowSorter(true);
        a_table.setAutoCreateRowSorter(true);


    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        a_table = new javax.swing.JTable();
        FirstName = new javax.swing.JTextField();
        Author_ID = new javax.swing.JTextField();
        LastName = new javax.swing.JTextField();
        author_id = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        First_name = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jTextField15 = new javax.swing.JTextField();
        Insert = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        view2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        ISBN_field = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        title = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        price1 = new javax.swing.JTextField();
        pagecount = new javax.swing.JLabel();
        PageCount = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookstable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        Search = new javax.swing.JButton();
        searchtext = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Publisher_ID = new javax.swing.JTextField();
        insert = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        view = new javax.swing.JButton();
        type = new javax.swing.JComboBox<>();
        Clear = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        text2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        p_table = new javax.swing.JTable();
        PPhone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Update_P = new javax.swing.JButton();
        Delete_P = new javax.swing.JButton();
        view1 = new javax.swing.JButton();
        PCity = new javax.swing.JTextField();
        PId = new javax.swing.JTextField();
        PName = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(96, 41, 41));
        jLabel8.setText("Books");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 225, 148));
        setLocation(new java.awt.Point(600, 300));

        jTabbedPane1.setBackground(new java.awt.Color(255, 225, 148));
        jTabbedPane1.setForeground(new java.awt.Color(76, 76, 109));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setAlignmentX(0.0F);
        jTabbedPane1.setAlignmentY(0.0F);
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTabbedPane1.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(218, 221, 252));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));

        a_table.setBackground(new java.awt.Color(76, 76, 109));
        a_table.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        a_table.setForeground(new java.awt.Color(255, 255, 255));
        a_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Author ID", "First Name", "Last Name"
            }
        ));
        a_table.setToolTipText("type");
        jScrollPane4.setViewportView(a_table);

        FirstName.setBackground(new java.awt.Color(76, 76, 109));
        FirstName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N


        Author_ID.setBackground(new java.awt.Color(76, 76, 109));
        Author_ID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N


        LastName.setBackground(new java.awt.Color(76, 76, 109));
        LastName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N


        author_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        author_id.setForeground(new java.awt.Color(51, 51, 51));
        author_id.setText("Author ID :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Last Name :");

        First_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        First_name.setForeground(new java.awt.Color(51, 51, 51));
        First_name.setText("First Name :");

        jButton7.setBackground(new java.awt.Color(76, 76, 109));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Search");
        jButton7.setActionCommand("search");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_Author(evt);
            }
        });

        jTextField15.setBackground(new java.awt.Color(76, 76, 109));
        jTextField15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N


        Insert.setBackground(new java.awt.Color(76, 76, 109));
        Insert.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Insert.setForeground(new java.awt.Color(255, 255, 255));
        Insert.setText("Insert");
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insert_auth(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(76, 76, 109));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_Author(evt);
            }
        });

        delete.setBackground(new java.awt.Color(76, 76, 109));
        delete.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteAuthor(evt);
            }
        });

        view2.setBackground(new java.awt.Color(76, 76, 109));
        view2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        view2.setForeground(new java.awt.Color(255, 255, 255));
        view2.setText("view");
        view2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_Author(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(First_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(author_id, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Author_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(view2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(First_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(author_id)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Author_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(view2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("ِِAuthor", jPanel2);

        jPanel1.setBackground(new java.awt.Color(57, 110, 176));

        ISBN_field.setBackground(new java.awt.Color(245, 245, 245));
        ISBN_field.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ISBN_field.setForeground(new java.awt.Color(240, 84, 84));


        id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setText("Title :");

        Title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("ISBN :");

        title.setBackground(new java.awt.Color(245, 245, 245));
        title.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        title.setForeground(new java.awt.Color(240, 84, 84));

        price.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        price.setForeground(new java.awt.Color(255, 255, 255));
        price.setText("Price :");

        price1.setBackground(new java.awt.Color(245, 245, 245));
        price1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        price1.setForeground(new java.awt.Color(240, 84, 84));


        pagecount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pagecount.setForeground(new java.awt.Color(255, 255, 255));
        pagecount.setText("Page Count :");

        PageCount.setBackground(new java.awt.Color(245, 245, 245));
        PageCount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PageCount.setForeground(new java.awt.Color(240, 84, 84));

        bookstable.setBackground(new java.awt.Color(245, 245, 245));
        bookstable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bookstable.setForeground(new java.awt.Color(240, 84, 84));
        bookstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Type", "Page Count", "Price", "ISBN", "Publisher ID"
            }
        ));
        bookstable.setToolTipText("type");
        jScrollPane1.setViewportView(bookstable);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Type");

        Search.setBackground(new java.awt.Color(245, 245, 245));
        Search.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Search.setForeground(new java.awt.Color(240, 84, 84));
        Search.setText("Search ");
        Search.setActionCommand("search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_Book(evt);
            }
        });

        searchtext.setBackground(new java.awt.Color(245, 245, 245));
        searchtext.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        searchtext.setForeground(new java.awt.Color(240, 84, 84));


        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Publisher ID :");

        Publisher_ID.setBackground(new java.awt.Color(245, 245, 245));
        Publisher_ID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Publisher_ID.setForeground(new java.awt.Color(240, 84, 84));

        insert.setBackground(new java.awt.Color(245, 245, 245));
        insert.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        insert.setForeground(new java.awt.Color(240, 84, 84));
        insert.setText("Insert");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insert_Book(evt);
            }
        });

        Delete.setBackground(new java.awt.Color(245, 245, 245));
        Delete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Delete.setForeground(new java.awt.Color(240, 84, 84));
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_Book(evt);
            }
        });

        update.setBackground(new java.awt.Color(245, 245, 245));
        update.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        update.setForeground(new java.awt.Color(240, 84, 84));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_Book(evt);
            }
        });

        view.setBackground(new java.awt.Color(245, 245, 245));
        view.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        view.setForeground(new java.awt.Color(240, 84, 84));
        view.setText("view");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_Book(evt);
            }
        });

        type.setBackground(new java.awt.Color(245, 245, 245));
        type.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        type.setForeground(new java.awt.Color(240, 84, 84));
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tech Books", "Bussiness Books", "Education Books", "Others" }));


        Clear.setBackground(new java.awt.Color(245, 245, 245));
        Clear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Clear.setForeground(new java.awt.Color(240, 84, 84));
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_Book(evt);
            }
        });

        jRadioButton1.setForeground(new java.awt.Color(240, 84, 84));
        jRadioButton1.setText("Type");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setForeground(new java.awt.Color(240, 84, 84));
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("ISBN");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        text2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        text2.setForeground(new java.awt.Color(240, 84, 84));
        text2.setText("ISBN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PageCount, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pagecount, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(38, 38, 38)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(price1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Publisher_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addComponent(id)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ISBN_field, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(searchtext, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)
                        .addGap(18, 18, 18)
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(611, 611, 611))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(price)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ISBN_field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(price1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pagecount, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PageCount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Publisher_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(477, 477, 477))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Search, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 1, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(searchtext, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text2)
                                    .addComponent(jRadioButton1)
                                    .addComponent(jRadioButton2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jTabbedPane1.addTab("Books", jPanel1);

        jPanel3.setBackground(new java.awt.Color(46, 76, 109));

        p_table.setAutoCreateRowSorter(true);
        p_table.setBackground(new java.awt.Color(252, 153, 124));
        p_table.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        p_table.setForeground(new java.awt.Color(25, 25, 25));
        p_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Publisher Code", "Name", "City", "Phone"
            }
        ));
        p_table.setToolTipText("type");
        p_table.setGridColor(new java.awt.Color(51, 0, 204));
        jScrollPane3.setViewportView(p_table);

        PPhone.setBackground(new java.awt.Color(252, 153, 124));
        PPhone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PPhone.setForeground(new java.awt.Color(25, 25, 25));


        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Publisher Name :");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("City :");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Publisher Code :");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Phone :");

        jButton6.setBackground(new java.awt.Color(252, 153, 124));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(25, 25, 25));
        jButton6.setText("Search ");
        jButton6.setActionCommand("search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_Publisher(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(252, 153, 124));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(25, 25, 25));
        jButton2.setText("Insert");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insert_Publisher(evt);
            }
        });

        Update_P.setBackground(new java.awt.Color(252, 153, 124));
        Update_P.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Update_P.setForeground(new java.awt.Color(25, 25, 25));
        Update_P.setText("Update");
        Update_P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_Publisher(evt);
            }
        });

        Delete_P.setBackground(new java.awt.Color(252, 153, 124));
        Delete_P.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Delete_P.setForeground(new java.awt.Color(25, 25, 25));
        Delete_P.setText("Delete");
        Delete_P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_Publisher(evt);
            }
        });

        view1.setBackground(new java.awt.Color(252, 153, 124));
        view1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        view1.setForeground(new java.awt.Color(25, 25, 25));
        view1.setText("view");
        view1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_Publisher(evt);
            }
        });

        PCity.setBackground(new java.awt.Color(252, 153, 124));
        PCity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PCity.setForeground(new java.awt.Color(25, 25, 25));


        PId.setBackground(new java.awt.Color(252, 153, 124));
        PId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PId.setForeground(new java.awt.Color(25, 25, 25));


        PName.setBackground(new java.awt.Color(252, 153, 124));
        PName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PName.setForeground(new java.awt.Color(25, 25, 25));


        jTextField1.setBackground(new java.awt.Color(252, 153, 124));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(25, 25, 25));

        jButton1.setBackground(new java.awt.Color(252, 153, 124));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(25, 25, 25));
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_Pub(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Delete_P, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Update_P, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(PId, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(29, 29, 29)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(PCity, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PName))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(view1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PCity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update_P, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete_P, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addComponent(view1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Publisher", jPanel3);

        jPanel6.setBackground(new java.awt.Color(255, 225, 148));
        jPanel6.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(76, 76, 109));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(76, 76, 109));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Book Library");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(456, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(426, 426, 426))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void groupButton(){
        ButtonGroup gp=new ButtonGroup();
        gp.add(jRadioButton1);
        gp.add(jRadioButton2);
    }
// Authors Buttons
    
    private void Insert_auth(java.awt.event.ActionEvent evt) {
         //check that's all data is inserted
        if(FirstName.getText().equals("")||LastName.getText().equals("")||Author_ID.getText().equals("")){
                JOptionPane.showMessageDialog(this,"please Enter All Data");
        }
        else {
        try{
            //Database Insertion >>
            Connection con=DBC.getConnect(); // to establish the connection
            PreparedStatement ps=con.prepareStatement("insert into author values (?,?,?)");
            ps.setInt(1, Integer.parseInt(Author_ID.getText()));
            ps.setString(2,FirstName.getText());
            ps.setString(3,LastName.getText());

            ps.executeUpdate();

            // Visual change >>
            String data[] = {Author_ID.getText(),FirstName.getText(),LastName.getText()};
            DefaultTableModel model = (DefaultTableModel)a_table.getModel();
            model.addRow(data);
            JOptionPane.showMessageDialog(this,"The Data is added Successfully");
            Author_ID.setText("");
            FirstName.setText("");
            LastName.setText("");
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
        }

    }

    private void Update_Author(java.awt.event.ActionEvent evt) {

        try {
           Connection con=DBC.getConnect(); // to establish the connection

           String sql = " update author set FirstName = ?,LastName = ? where Author_ID = ?";
           PreparedStatement pstm = con.prepareStatement(sql);
           pstm.setString(1 , FirstName.getText());
           pstm.setString(2,LastName.getText() );
           pstm.setInt(3 , Integer.parseInt(Author_ID.getText() ));
           pstm.executeUpdate();
           JOptionPane.showMessageDialog(null, "Author Updated successfully");


        } catch (NumberFormatException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Faild");
        }

    }
    private void View_Author(java.awt.event.ActionEvent evt) {
        view2.setText("Refresh");
        try{
            Connection con=DBC.getConnect(); // to establish the connection
            Statement st=con.createStatement();
            String sql="Select * from author";
            ResultSet rs=st.executeQuery(sql);
            DefaultTableModel model = (DefaultTableModel) a_table.getModel();
            model.setRowCount(0);
            while(rs.next()){
                String author_id=rs.getString("author_id");
                String FirstName=rs.getString("FirstName");
                String LastName=rs.getString("LastName");
                String data[]={author_id,FirstName,LastName};
                model=(DefaultTableModel)a_table.getModel();
                model.addRow(data);

            }

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,e);
        }
    }
    private void DeleteAuthor(java.awt.event.ActionEvent evt) {
        if(a_table.getSelectedRow()>=0){
            try
            {
                //for database deletion
                Connection con=DBC.getConnect(); // to establish the connection
                Statement st=con.createStatement();
                int row = a_table.getSelectedRow();
                String id=(String)a_table.getModel().getValueAt(row, 0);
                String sql="delete from author where Author_ID="+id+";";
                st.executeUpdate(sql);
                // for visual interchange
                DefaultTableModel model = (DefaultTableModel)a_table.getModel();
                model.removeRow(row);
                JOptionPane.showMessageDialog(this,"The row is Deleted successfully");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,ex);
            }
        }
        else{
            JOptionPane.showMessageDialog(this,"Select a row to delete");
        }
    }
// Publisher Buttons
    private void Update_Publisher(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_Publisher
        try {
            
            Connection con=DBC.getConnect(); // to establish the connection
            String sql = " update publisher set PName = ?, city=? , Phone = ? where ID = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1 , PName.getText());
            pre.setString(2,PCity.getText());
            pre.setString(3,PPhone.getText());
            pre.setInt(4,Integer.parseInt(PId.getText()));
            pre.executeUpdate();
            PName.setText(null);
            PCity.setText(null);
            PPhone.setText(null);
            PId.setText(null);
            JOptionPane.showMessageDialog(null, "Publisher is Updated successfully");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR HAPPENED");
        }
    }//GEN-LAST:event_Update_Publisher
    private void Search_Author(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_Author
        try {
            Connection con=DBC.getConnect(); // to establish the connection
            Statement st=con.createStatement();
            String search=jTextField15.getText();
            String sql="Select * from author where Author_ID="+search;
            ResultSet rs=st.executeQuery(sql);
            DefaultTableModel model = (DefaultTableModel) a_table.getModel();
            model.setRowCount(0);
            while(rs.next()){
                String AuthorId=rs.getString("Author_ID");
                String f_name=rs.getString("FirstName");
                String l_name=rs.getString("LastName");


                String data[]={AuthorId,f_name,l_name};
                model=(DefaultTableModel)a_table.getModel();
                model.addRow(data);
            }
            jTextField15.setText(null);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"There's an error");
        }
    }//GEN-LAST:event_Search_Author

    
    
    private void View_Publisher(java.awt.event.ActionEvent evt) {                                
        view1.setText("Refresh");
        try{
            Connection con=DBC.getConnect(); // to establish the connection
            Statement st=con.createStatement();
            String sql="select * from publisher";
            ResultSet rs=st.executeQuery(sql);
            DefaultTableModel model = (DefaultTableModel) p_table.getModel();
            model.setRowCount(0);
            while(rs.next()){
                String publisher_code=rs.getString("ID");
                String name=rs.getString("PName");
                String city=rs.getString("city");
                String phone=rs.getString("Phone");
                

                String data[]={publisher_code,name,city,phone};
                model=(DefaultTableModel)p_table.getModel();
                model.addRow(data);

            }

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,e);
        }
                                        

    }
    private void Insert_Publisher(java.awt.event.ActionEvent evt) {                                  
        //check that's all data is inserted
        if(PName.getText().equals("")||PCity.getText().equals("")||PId.getText().equals("")||PPhone.getText().equals("")){
            JOptionPane.showMessageDialog(this,"please Enter All Data");
        }
        else {
            try{
                //Database Insertion >>
                Connection con=DBC.getConnect(); // to establish the connection
                PreparedStatement ps=con.prepareStatement("insert into publisher values (?,?,?,?)");
                ps.setString(1, PName.getText());
                ps.setInt(2,Integer.parseInt(PId.getText()));
                ps.setString(3,PCity.getText());
                ps.setString(4, PPhone.getText());
                ps.executeUpdate();

                // Visual change >>
                String data[] = {PId.getText(),PName.getText(),PCity.getText(),PPhone.getText()};
                DefaultTableModel model = (DefaultTableModel)p_table.getModel();
                model.addRow(data);
                JOptionPane.showMessageDialog(this,"The Data is added Successfully");
                PId.setText("");
                PName.setText("");
                PCity.setText("");
                PPhone.setText("");

            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(this,ex);
            }
        }

    }

    private void Search_Publisher(java.awt.event.ActionEvent evt) {                                  
        try {
            Connection con=DBC.getConnect(); // to establish the connection
            Statement st=con.createStatement();
            String search=jTextField1.getText();
            String sql="Select * from publisher where ID="+search;
            ResultSet rs=st.executeQuery(sql);
            DefaultTableModel model = (DefaultTableModel) p_table.getModel();
            model.setRowCount(0);
            while(rs.next()){
                String id=rs.getString("ID");
                String name=rs.getString("PName");
                String city=rs.getString("city");
                String phone=rs.getString("Phone");
                String data[]={id,name,city,phone};
                model=(DefaultTableModel)p_table.getModel();
                model.addRow(data);
            }
            jTextField15.setText(null);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"There's an error");
        }
    }

    private void Delete_Publisher(java.awt.event.ActionEvent evt) {                                  
        if(p_table.getSelectedRow()>=0){
            try
            {
                //for database deletion
                Connection con=DBC.getConnect(); // to establish the connection
                Statement st=con.createStatement();
                int row = p_table.getSelectedRow();
                String id=(String)p_table.getModel().getValueAt(row, 0);
                String sql="delete from publisher where ID="+id+";";
                st.executeUpdate(sql);
                // for visual interchange
                DefaultTableModel model = (DefaultTableModel)p_table.getModel();
                model.removeRow(row);
                JOptionPane.showMessageDialog(this,"The row is Deleted successfully");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,ex);
            }
        }
        else{
            JOptionPane.showMessageDialog(this,"Select a row to delete");
        }
    }

    private void Clear_Pub(java.awt.event.ActionEvent evt) {                           

        PCity.setText(null);
        PPhone.setText(null);
        PId.setText(null);
        PName.setText(null);
    }

    private void View_Book(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_Book
        
        view.setText("Refresh");
        try{
            Connection con=DBC.getConnect(); // to establish the connection
            Statement st=con.createStatement();
            String sql="Select * from book";
            ResultSet rs=st.executeQuery(sql);
            DefaultTableModel model = (DefaultTableModel) bookstable.getModel();
            model.setRowCount(0);
            while(rs.next()){
                String title=rs.getString("title");
                String type=rs.getString("type");
                String count=rs.getString("page_count");
                String price=rs.getString("price");
                String id=rs.getString("ISBN");
                String publisher=rs.getString("Publisher_code");

                String data[]={title,type,count,price,id,publisher};
                model=(DefaultTableModel)bookstable.getModel();
                model.addRow(data);

            }

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_View_Book


    private void Update_Book(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_Book

        try {
            Connection con=DBC.getConnect(); // to establish the connection

            String sql = " update book set title = ?, type=? , price = ?, page_count = ?, Publisher_code=? where ISBN = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            
            pre.setString(1 , title.getText());
            pre.setString(2,type.getSelectedItem().toString());
            pre.setInt(3 , Integer.parseInt(price1.getText() ));
            pre.setInt(4 , Integer.parseInt(PageCount.getText() ));
            pre.setInt(5 , Integer.parseInt(Publisher_ID.getText() ));
            pre.setInt(6 , Integer.parseInt(ISBN_field.getText()));
            pre.executeUpdate();
            title.setText(null);
        ISBN_field.setText(null);
        Publisher_ID.setText(null);
        PageCount.setText(null);
        price1.setText(null);
            JOptionPane.showMessageDialog(null, "Book Updated successfully");

        } catch (NumberFormatException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Faild .");
        }
    }//GEN-LAST:event_Update_Book

    private void Delete_Book(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_Book
        if(bookstable.getSelectedRow()>=0){
        try
           {
            //for database deletion 
            Connection con=DBC.getConnect(); // to establish the connection
            Statement st=con.createStatement();
            // for visual interchange
            int row = bookstable.getSelectedRow();
            String isbn=(String)bookstable.getModel().getValueAt(row, 4);
            String sql="delete from book where ISBN="+isbn+";";
            st.executeUpdate(sql);
            DefaultTableModel model = (DefaultTableModel)bookstable.getModel();
            model.removeRow(row);
            JOptionPane.showMessageDialog(this,"The row is Deleted successfully");
               
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,ex);
        }
        }
        else{
            JOptionPane.showMessageDialog(this,"Select a row to delete");
        }
    }//GEN-LAST:event_Delete_Book

    private void Insert_Book(java.awt.event.ActionEvent evt) {                             
        //check that's all data is inserted    
        if(ISBN_field.getText().equals("")||title.getText().equals("")||price.getText().equals("")||PageCount.getText().equals("")||type.getSelectedItem().toString().equals("")|| Publisher_ID.getText().equals("")){
                JOptionPane.showMessageDialog(this,"please Enter All Data");
        }
        else {
        try{
            //Database Insertion >>
            Connection con=DBC.getConnect(); // to establish the connection
            PreparedStatement ps=con.prepareStatement("insert into book values (?,?,?,?,?,?)");
            ps.setInt(1, Integer.parseInt(ISBN_field.getText()));
            ps.setString(2,title.getText());
            ps.setString(3,PageCount.getText());
            ps.setString(4, price1.getText());
            ps.setString(5, type.getSelectedItem().toString());
            ps.setString(6, Publisher_ID.getText());
            ps.executeUpdate();
            // Visual change >>
            String data[] = {title.getText(),type.getSelectedItem().toString(),PageCount.getText(),price1.getText(),ISBN_field.getText(),Publisher_ID.getText()};
            DefaultTableModel model = (DefaultTableModel)bookstable.getModel();
            model.addRow(data);
            JOptionPane.showMessageDialog(this,"The Data is added Successfully");
            title.setText("");
            PageCount.setText("");
            price1.setText("");
            ISBN_field.setText("");
            Publisher_ID.setText("");
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
        }
    }



    private void Clear_Book(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_Book
        
        title.setText("");
            PageCount.setText("");
            price1.setText("");
            ISBN_field.setText("");
            Publisher_ID.setText("");
        
    }//GEN-LAST:event_Clear_Book

    private void Search_Book(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_Book
        String search=searchtext.getText();
        char ch='"';
        String sql;
        if(radio){
            sql="Select * from book where type= "+ch+search+ch;
        }
        else{
            sql="Select * from book where ISBN= "+search;
        }
        try {
            Connection con=DBC.getConnect(); // to establish the connection
            Statement st=con.createStatement();
            
            
            ResultSet rs=st.executeQuery(sql);
            DefaultTableModel model = (DefaultTableModel) bookstable.getModel();
            model.setRowCount(0);
            while(rs.next()){
                String title=rs.getString("title");
                String type=rs.getString("type");
                String count=rs.getString("page_count");
                String price=rs.getString("price");
                String id=rs.getString("ISBN");
                String publisher=rs.getString("Publisher_code");

                String data[]={title,type,count,price,id,publisher};
                model=(DefaultTableModel)bookstable.getModel();
                model.addRow(data);
            }
            searchtext.setText(null);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"There's an error");
        }
            
    }//GEN-LAST:event_Search_Book

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        text2.setText("Type :");
        radio=true;
    }

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        radio=false;
        text2.setText("ISBN :");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Author_ID;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Delete_P;
    private javax.swing.JTextField FirstName;
    private javax.swing.JLabel First_name;
    private javax.swing.JTextField ISBN_field;
    private javax.swing.JButton Insert;
    private javax.swing.JTextField LastName;
    private javax.swing.JTextField PCity;
    private javax.swing.JTextField PId;
    private javax.swing.JTextField PName;
    private javax.swing.JTextField PPhone;
    private javax.swing.JTextField PageCount;
    private javax.swing.JTextField Publisher_ID;
    private javax.swing.JButton Search;
    private javax.swing.JLabel Title;
    private javax.swing.JButton Update_P;
    private javax.swing.JTable a_table;
    private javax.swing.JLabel author_id;
    private javax.swing.JTable bookstable;
    private javax.swing.JButton delete;
    private javax.swing.JLabel id;
    private javax.swing.JButton insert;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTable p_table;
    private javax.swing.JLabel pagecount;
    private javax.swing.JLabel price;
    private javax.swing.JTextField price1;
    private javax.swing.JTextField searchtext;
    private javax.swing.JLabel text2;
    private javax.swing.JTextField title;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JButton update;
    private javax.swing.JButton view;
    private javax.swing.JButton view1;
    private javax.swing.JButton view2;
    // End of variables declaration//GEN-END:variables

    
}
