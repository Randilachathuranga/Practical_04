object O4{
    case class Account(accountNumber: Int, balance: Double)

    def negativeBalanceAccounts(bank: List[Account]): List[Account] = {
    bank.filter(_.balance < 0)
    }

    def totalBalance(bank: List[Account]): Double = {
    bank.map(_.balance).sum
    }

    def applyInterest(bank: List[Account]): List[Account] = {
    bank.map { account =>
        val newBalance = if (account.balance > 0) {
        account.balance * 1.05
        } else {
        account.balance * 1.01
        }
        account.copy(balance = newBalance)
    }
    }

    def main(args: Array[String]):Unit = {
        val bank = List(
        Account(1, 100.0),
        Account(2, -50.0),
        Account(3, 200.0),
        Account(4, -30.0)
        )

        println("Accounts with Negative Balances:")
        println(negativeBalanceAccounts(bank))

        println("\nTotal Balance of All Accounts:")
        println(totalBalance(bank))

        println("\nFinal Balances After Applying Interest:")
        println(applyInterest(bank))
    }
}