public class verificarValores {
    public static String verificarDoisDiasSemana() {
		String hotel = null; 
		Bridgewood bridgewood = new Bridgewood();
		Lakewood lakewood = new Lakewood();
		Ridgewood ridgewood = new Ridgewood();

		if (bridgewood.valorBrid < lakewood.valorLakewo && bridgewood.valorBrid < ridgewood.valorRid) {
			hotel = " Bridgewood";
			
		} else if (ridgewood.valorRid < lakewood.valorLakewo && ridgewood.valorRid < bridgewood.valorBrid) {
			hotel = "RIDGEWOOD";
		} else if (lakewood.valorLakewo < ridgewood.valorRid && lakewood.valorLakewo < bridgewood.valorBrid) {
			hotel = "Lakewood";
		}else
			hotel = "RIDGEWOOD";
		return hotel;
		
	}
	
	public static String verificarDoisDiasSemanaFidelidade() {
		Bridgewood bridgewood = new Bridgewood();
		Lakewood lakewood = new Lakewood();
		Ridgewood ridgewood = new Ridgewood();
		
		String hotel = null; 

		if (bridgewood.valorBridEs < lakewood.valorLakewoEs && bridgewood.valorBridEs < ridgewood.valorRidEs) {
			hotel = " Bridgewood";
		} else if (ridgewood.valorRidEs < lakewood.valorLakewoEs && ridgewood.valorRidEs < bridgewood.valorBridEs) {
			hotel = " Ridgewood";
		} else if (lakewood.valorLakewoEs < bridgewood.valorBridEs && lakewood.valorLakewoEs < ridgewood.valorRidEs) {
			hotel = "Lakewood";
		}else
			hotel="Ridgewood";
		return hotel;
	}

	public static String verificarDoisDiasFinalDeSemana() {
		String hotel ; 
		Bridgewood bridgewood = new Bridgewood();
		Lakewood lakewood = new Lakewood();
		Ridgewood ridgewood = new Ridgewood();
		if (lakewood.valorLakewo2 < bridgewood.valorBrid2 && lakewood.valorLakewo2 < ridgewood.valorRid2) {
			hotel = "Lakewood";
		} else if (bridgewood.valorBrid2 < lakewood.valorLakewo2 && bridgewood.valorBrid2 < ridgewood.valorRid2) {
			hotel = "Bridgewood";
		} else if (ridgewood.valorRid2 < lakewood.valorLakewo2 && ridgewood.valorRid2 < bridgewood.valorBrid2) {
			hotel= "Ridgewood";
		}else
			hotel = "Ridgewood";
		return hotel;
	}
	


	public static String verificarDoisDiasFinalDeSemanaFidelidade() {
		String hotel = null; 
		Bridgewood bridgewood = new Bridgewood();
		Lakewood lakewood = new Lakewood();
		Ridgewood ridgewood = new Ridgewood();
		if (lakewood.valorLakewoEs2 < bridgewood.valorBridEs2 && lakewood.valorLakewoEs2 < ridgewood.valorRidEs2) {
			hotel="Lakewood";
		} else if (bridgewood.valorBridEs2 < lakewood.valorLakewoEs2 && bridgewood.valorBridEs2 < ridgewood.valorRidEs2) {
			hotel = "Bridgewood";
		} else if (ridgewood.valorRidEs2 < lakewood.valorLakewoEs2 && ridgewood.valorRidEs2 < bridgewood.valorBridEs2) {
			hotel= "Ridgewood";
		}else
			hotel="Ridgewood";
		return hotel;
	}
	
	public static String quandoETresDiasDaSemana() {
		Bridgewood bridgewood = new Bridgewood();
		Lakewood lakewood = new Lakewood();
		Ridgewood ridgewood = new Ridgewood();
		String hotel; 
		if(lakewood.valorLakewo3 < bridgewood.valorBrid3 && lakewood.valorLakewo3 < ridgewood.valorRid3) {
			hotel = "Lakewood";
		}else if (bridgewood.valorBrid3 < lakewood.valorLakewo3 && bridgewood.valorBrid3 < ridgewood.valorRid3) {
			hotel = "Bridgewood";

		} else if (ridgewood.valorRid3 < lakewood.valorLakewo3 && ridgewood.valorRid3 < bridgewood.valorBrid3) {
			hotel ="Ridgewood";
		}else
			hotel = "Ridgewood";
		
		return hotel;
	}

	public static String verificaTresDiasDaSemanaFidelidade() {
		String hotel = null; 
		Bridgewood bridgewood = new Bridgewood();
		Lakewood lakewood = new Lakewood();
		Ridgewood ridgewood = new Ridgewood();
		if(lakewood.valorLakewoEs3 < bridgewood.valorBridEs3 && lakewood.valorLakewoEs3 < ridgewood.valorRidEs3) {
			hotel = "Lakewood";
		}else if (bridgewood.valorBridEs3 < lakewood.valorLakewoEs3 && bridgewood.valorBridEs3 < ridgewood.valorRidEs3) {
			hotel = "Bridgewood";

		} else if (ridgewood.valorRidEs3 < lakewood.valorLakewoEs3 && ridgewood.valorRidEs3 < bridgewood.valorBridEs3) {
			hotel = "Ridgewood";
		}else
			hotel = "Ridgewood";
		return hotel;
    }
}