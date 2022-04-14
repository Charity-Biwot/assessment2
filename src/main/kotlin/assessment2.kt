fun main(){
    var balance=500+1500
    println(balance)
    var balancewithdrawn=(1500-500)
    println(balancewithdrawn)

}
//1.Create a classCurrentAccount with the following attributes:account
//number, account name, balance. It has the following functions:
//a.deposit(amount: Double) - Increments the balance bythe
//amount deposited
//b.withdraw(amount: Double) - Decrements the balanceby the
//amount withdrawn
//c.details() - Prints out the account number and balanceand
//name in this format: “Account number x with balance y is operated by z
fun classCurrentAccount(){
    var attributes=arrayOf("account number","account name","balance")
    var amount=500
    var deposit=1500
    var balance=amount+deposit
    println(balance)

    }
fun amountwithddawn(amount: Double){
    var amount=500
    var deposit=1500
    var balance=deposit-amount
    println(balance)
}
fun details(){
    var attributes= arrayListOf("account number$","account name","balance$")
    var accountnumber="y"
    var balance="x"
    println(details())
}
//create another classSavingsAccount. It has the samefunctions and
//attributes as the current account except for one attribute,
//withdrawals: Int. Withdrawals is a counter variablethat is used to
//keep track of how many withdrawals have been made from the account
//in a year. The only other difference is that the savings account
//withdraw() method first checks if the number of withdrawalsis less
//than 4 for it to allow one to withdraw money from the account. It also
//increments the withdrawals attribute after a successful withdrawal
//(5points)
 class savingsSavingAccount(){
     var attributes=arrayOf("account name","account number","balance")
    var amount=500
    var deposit=1500
    var withdrawals=deposit/amount




}



//3.A product is represented by a data class with these attributes: name,
//weight, price, category. Category can either be groceries, hygiene or
//other. Write a function that takes in a product and uses a when
//statement to assign each product to a list based on its category
//(3 points)
//4.Write a function that given a string returns a string composed of only
//the characters in even indices. For example given “banana” it will return











