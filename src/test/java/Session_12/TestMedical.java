package Session_12;

public  class TestMedical  {
	
	public static void main(String[] args) {
//		 _4_IndianMedical im = new  _4_IndianMedical(); can't make interfaces object
		
		ApolloHospital op = new ApolloHospital();
		
		op.emergencyService();
		op.ENTService();
		op.getPatientHistory();
		op.intership();
		op.medicalInsurance();
		op.neuroService();
		op.oncologyService();
		op.opService();
		op.orthoPedicService();
		op.pathologyService();
		op.physioService();
		op.polioService();
		op.radiologySerice();
		System.out.println(_2_UsMedical.medicalFees);
		
//		Top Casting 
		 _2_UsMedical us1	 = new ApolloHospital();
		us1.intership();
		us1.oncologyService();
		us1.orthoPedicService();
		us1.physioService();
		us1.polioService();
		us1.radiologySerice();
		System.out.println(_2_UsMedical.medicalFees);
		
		_1_WHO wh = new ApolloHospital();
		
		wh.polioService();
		
		
//		Down casting
		
//		ApolloHospital ap = new _2_UsMedical();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
