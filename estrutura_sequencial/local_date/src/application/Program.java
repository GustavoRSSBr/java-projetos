package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		// Testando LocalDate, LocalDateTime e Instant
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // formato
																													// para
																													// Instant

		LocalDate d1 = LocalDate.now(); // Pega a data
		LocalDateTime d2 = LocalDateTime.now();
		Instant d3 = Instant.now(); // Pega o horario atual de Londres(default de instant)

		LocalDate d4 = LocalDate.ofInstant(d3, ZoneId.of("Portugal")); // converte instant pra localDate com ZoneId
																		// especifico
		LocalDateTime d5 = LocalDateTime.ofInstant(d3, ZoneId.of("America/Chicago"));
		
		LocalDate d6 = LocalDate.parse("07/10/1999", fmt1); //texto formatado para localdate 

		System.out.println(d1); // imprime data atual

		System.out.println(d2); // imprime data e horario atual

		System.out.println(d1.format(fmt1)); // data formatada

		System.out.println(d2.format(fmt2));// data formatada

		System.out.println(fmt3.format(d3)); // Instant data formatada com o zoneId do usuário

		System.out.println(fmt1.format(d4)); // Instant -> LocalDate: formatada com o zoneId especifico

		System.out.println(fmt2.format(d5)); // Instant -> LocalDateTime: formatada com o zoneId especifico
		
		System.out.println(d6.format(fmt1));

	}

}
