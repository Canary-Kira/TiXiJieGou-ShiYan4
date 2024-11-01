package demo;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TaxCalculateServlet extends HttpServlet {
    private TaxCalculate taxCalculateService = new TaxCalculate();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        double income = Double.parseDouble(request.getParameter("income"));
        double deductions = Double.parseDouble(request.getParameter("deductions"));
        double tax = taxCalculateService.calculateTax(income, deductions);

        response.setContentType("text/plain");
        response.getWriter().write("Tax: " + tax);
    }
}
