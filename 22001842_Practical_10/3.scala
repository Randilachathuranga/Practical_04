import scala.collection.mutable.Map
object O3{

    class Account(var balance:Double, var accountNo:Int){

        def Deposit(amount:Double):Unit={
            if (amount > 0) {
                this.balance = this.balance + amount;
                println(s"The new balance is =${this.balance}");
            }
            else{
                println("Deposit amount can not be less that or equal to 0")
            }
        }

        def Withdraw(amount:Double):Unit={
            if (amount > 0 && amount <= this.balance) {
                this.balance = this.balance - amount;
                println(s"The new balance is =${this.balance}");
            }
            else if (amount > this.balance){
                println("Insufficient funds for this withdrawal")
            }
            else{
                println("Withdrawal amount must be greater than zero")
            }
        }

        def Transfer(account:Account, amount:Double):Unit={
            if (amount > 0 && amount <= balance) {
                account.balance = account.balance + amount;
                println(s"Transfer to ${account.accountNo} successful")
            }
            else if (amount > this.balance){
                println("Insufficient funds for this transfer")
            }
            else{
                println("transfer amount must be greater than zero")
            }
        }
    }

    def main(args: Array[String]):Unit = {
        val accounts: Map[Int, Account] = Map()

        val account1 = new Account(1000, 123)
        val account2 = new Account(500, 456)

        accounts += (123 -> account1)
        accounts += (456 -> account2)

        val fromAccountNo = 123
        val toAccountNo = 456
        val transferAmount = 300

        if (accounts.contains(fromAccountNo) && accounts.contains(toAccountNo)) {
            val fromAccount = accounts(fromAccountNo)
            val toAccount = accounts(toAccountNo)
            fromAccount.Transfer(toAccount, transferAmount)
        } 
        else {
            println("One or both of the accounts were not found.")
        }
    }
}