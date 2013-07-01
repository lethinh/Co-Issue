<%@page import="javax.naming.InitialContext" %>
<%@page import="javax.sql.DataSource" %>
<%@page import="java.sql.*" %>


<% 
InitialContext ic = new InitialContext();
DataSource ds = (DataSource) ic.lookup("java:comp/env/jdbc/MsrProcessDB");
%>

<% 
Connection con = ds.getConnection();
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("SELECT ID,NAME FROM [CoIssue_Test].[dbo].[Employee] ");

while(rs.next()){
 out.println(rs.getString(1));
 out.println(rs.getString(2)+"  ____________ ");
}

rs.close();
stmt.close();
con.close();

%>
