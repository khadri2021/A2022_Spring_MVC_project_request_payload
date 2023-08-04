
<%@ page import="com.khadri.spring.mvc.form.Order" %>
<html>
<body>
 
 <% Order order = (Order)request.getAttribute("orderData"); %>
 
 Order Name : <%=order.getOrderName()%> <br>
 Order Type : <%=order.getOrderType()%> <br>
 Order Cost : <%=order.getOrderCost()%> <br>
 Order Location : <%=order.getOrderLocation()%> <br>
 Order GST :  <%=order.getOrderGST()%> <br>
 Order Total Cost : <%=order.getOrderTotalCost()%> <br>
 
 
</body>
</html>
