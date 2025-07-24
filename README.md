## 📊 Java Query Language

A simple Java-based **in-memory Employee Database** simulation with querying, sorting, and filtering features.

---

## 📘 Description

This project implements an Employee database system in Java that mimics basic database functionalities like:

- ✅ Adding employees
- 🔍 Searching/filtering by job, department, salary, commission, and hierarchy
- 📊 Sorting by various fields
- 🔐 Simulated login
- ❌ Oracle-style error messages (`ORA-12154`) for unauthorized access

All data is stored **in memory**, and no external DB is required.

---

## ⚙️ Features

| 🚀 Feature                   | 📝 Description                                               |
|-----------------------------|--------------------------------------------------------------|
| ➕ **Add Employees**         | Add employee data with ID, job, salary, manager, etc.        |
| 🔐 **Login Simulation**      | Basic authentication to access the database                  |
| 🔍 **Search by Job**         | Filter employees by job title (case-insensitive)             |
| 🏢 **Search by Department**  | Find employees by department number                          |
| 💰 **Search by Salary**      | Use `<`, `=`, `>` to compare salaries                        |
| 💸 **Commission Filter**     | Find employees with non-zero commission                     |
| 👑 **Find President**        | Employee with manager number `-1`                            |
| 👥 **Manager Mapping**       | List all employees under a specific manager                  |
| 🔄 **Sort Employees**        | Sort by empid, depno, name, job, salary, or commission       |
| 📈 **Salary Stats**          | View max, min, 2nd max/min salaries                          |
| ⚠️ **Error Handling**        | Simulated Oracle DB error (`ORA-12154`) on unauthorized actions |

---

## 🧰 Technologies Used

- 🟨 Java (Core)
- 🧠 OOP Concepts

---

## 📁 Project Structure
```plaintext
JavaQueryLanguage/
├── DB/
│   ├── Employee.java          # 📌 Employee blueprint (POJO class)
│   ├── EmployeeDB.java        # 🧠 Core logic: data storage, querying, sorting, filtering
│   └── EmployeeDriver.java    # 🚀 Main class with sample data and method calls for testing
├── README.md                  # 📄 Project documentation (this file)
└── LICENSE                    # 📝 License file (MIT)
```

## ▶️ How to Run

1. Clone or download the repository.
2. Compile all Java files inside the `DB` package.
3. Run the `EmployeeDriver` class, which contains the `main` method with sample data and test cases.
4. You can uncomment or add calls to different methods on the `EmployeeDB` instance to test various features.

```bash
# Compile all Java classes
javac DB/*.java

# Run the program
java DB.EmployeeDriver



