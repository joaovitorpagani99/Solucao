import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
public class HotelReservation {
        public static String getCheapestHotel(String input) throws ParseException {
            VerificarValores verifica = new VerificarValores();
            Scanner sc = new Scanner(System.in);
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            
            Calendar calendar = Calendar.getInstance();
		Calendar calendar1 = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();
		
		
		String[] vetorNome = input.split(" ");
		String[] vetorDt1 = input.split(" ");
		String[] vetorDt2 = input.split(" ");
		String[] vetorDt3 = input.split(" ");
		
		vetorNome = vetorNome[0].split(":");
		vetorDt1 = vetorDt1[1].split(",");
		vetorDt2 = vetorDt2[2].split(",");
		vetorDt3 = vetorDt3[3].split(",");
		
		calendar.setTime(format.parse(vetorDt1[0]));
		calendar1.setTime(format.parse(vetorDt2[0]));
		calendar2.setTime(format.parse(vetorDt3[0]));
		

		 
		 if(calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || calendar.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY && calendar1.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY 
					||calendar1.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY && calendar2.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY ||calendar2.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY ) {
				if(vetorNome[0].equalsIgnoreCase("regular"))
					input =	verifica.verificarDoisDiasFinalDeSemana();
				if(vetorNome[0].equalsIgnoreCase("Reward"))
					input =	verifica.verificarDoisDiasFinalDeSemanaFidelidade(); 
				
			} 
			
			else if(calendar.get(Calendar.DAY_OF_WEEK) == calendar.SUNDAY && calendar1.get(Calendar.DAY_OF_WEEK) == calendar.MONDAY ||
					calendar1.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY && calendar2.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
				if(vetorNome[0].equalsIgnoreCase("regular"))
					input =verifica.verificarDoisDiasSemana();
				if(vetorNome[0].equalsIgnoreCase("Reward"))
					input =verifica.verificarDoisDiasSemanaFidelidade();
			}
			
			else if(calendar.get(Calendar.DAY_OF_WEEK) != calendar.SUNDAY && calendar2.get(Calendar.DAY_OF_WEEK) != calendar.TUESDAY || calendar.get(Calendar.DAY_OF_WEEK) != calendar.THURSDAY && calendar2.get(Calendar.DAY_OF_WEEK) != calendar.SATURDAY ) {
				if(vetorNome[0].equalsIgnoreCase("regular"))
					input = verifica.quandoETresDiasDaSemana();
				if(vetorNome[0].equalsIgnoreCase("Reward"))
					input = verifica.verificaTresDiasDaSemanaFidelidade();
			}
		return input;
	}
    }
