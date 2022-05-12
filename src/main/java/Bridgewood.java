public class Bridgewood {
    int taxaDiaDeSemana = 160;
	int taxaSemanaEspecial = 110;
	
	int taxaFinalDeSemana = 60;
	int taxaFinalDeSemanaEspecial = 50;
	
	int TipoDeClassificacao = 4;
	
	
	int valorBrid = (taxaDiaDeSemana * 2) + taxaFinalDeSemana;
	int valorBridEs = (taxaSemanaEspecial * 2) + taxaFinalDeSemanaEspecial;
	
	int valorBrid2 = (taxaFinalDeSemana * 2) + taxaDiaDeSemana;
	int valorBridEs2 = (taxaFinalDeSemanaEspecial * 2) + taxaSemanaEspecial;
	
	int valorBrid3 = taxaDiaDeSemana * 3;
	int valorBridEs3 = taxaSemanaEspecial * 3;
}
