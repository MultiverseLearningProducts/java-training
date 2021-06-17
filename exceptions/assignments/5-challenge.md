## Steps

  1. In the `ExceptionDemos` class, Add the following code:
  ```java
    public void updateSalesFigures(int sales, String coffeeName) {

        String updateString =
                "update COFFEES set SALES = ? where COF_NAME = ?";

        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:system/pass123@localhost:1521:XE"));
        PreparedStatement updateSales = conn.prepareStatement(updateString);
        conn.setAutoCommit(false);

        updateSales.setInt(1, sales);
        updateSales.setString(2, coffeeName);
        updateSales.executeUpdate();

    }
  ```

## Challenge
  1. Modify the code to remove all compilation errors!