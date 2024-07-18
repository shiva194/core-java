class Atm{

    private String bankName;
    private String location;
    private int totalCash;
    private int maxWithdrawalLimit;
    private int minBalance;


    public boolean create(String bankName, String location, int totalCash, int maxWithdrawalLimit, int minBalance) {
        boolean isCreated=false;
		if(bankName!=null && location!=null && totalCash>0 &&maxWithdrawalLimit>0 && maxWithdrawalLimit>0){
		this.bankName = bankName;
        this.location = location;
        this.totalCash = totalCash;
        this.maxWithdrawalLimit = maxWithdrawalLimit;
        this.minBalance = minBalance;
		isCreated=true;
		}
		return isCreated;
    }

    public void getInfo(){
	System.out.println("bank name :"+this.bankName);
	System.out.println("Location :"+this.location);
	System.out.println("Total cash :"+this.totalCash);
	System.out.println("max Withdrawal Limit :"+this.maxWithdrawalLimit);
	System.out.println("min Balance :"+this.minBalance);
	}
}
