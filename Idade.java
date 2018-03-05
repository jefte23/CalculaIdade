import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Idade {

	public static void main(String[] args) {

		String data = "1988-09-17";
		DateTimeFormatter formatter  = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate date = LocalDate.parse(data,formatter);
		Period idade = Period.between(date, LocalDate.now());
		
		JOptionPane.showMessageDialog(null, date);
		JOptionPane.showMessageDialog(null, idade);
		JOptionPane.showMessageDialog(null, idade.getYears());
		
	}

}
