package org.example.practice2_arithmetic

fun main() {

    val employeesCount = 50
    val employeeSalary = 30000

    val internsCount = 30
    val internSalary = 20000

    // Расходы на выплату зарплаты постоянных сотрудников
    val expensesEmployees = employeesCount * employeeSalary

    // Общие расходы по ЗП после прихода стажеров
    val expensesInterns = internsCount * internSalary
    val totalExpenses = expensesEmployees + expensesInterns

    // Средняя ЗП одного сотрудника после устройства стажеров
    val totalEmployeesCount = employeesCount + internsCount
    val averageSalaryPerEmployee = totalExpenses / totalEmployeesCount

    println("Расходы на выплату зарплаты постоянных сотрудников: $expensesEmployees")
    println("Общие расходы по ЗП после прихода стажеров: $totalExpenses")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalaryPerEmployee")
}
