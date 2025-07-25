## 📊 Java Query Language

A powerful, Java-based **in-memory Employee Database System** that simulates core relational database operations — including **queries, sorting, transaction handling, and recovery mechanisms** — all using Java.

---

## 📘 Description

This project simulates a mini relational database system in Java with a variety of features inspired by SQL and Oracle DB behaviors. It provides a console-driven interface to manage `Employee` records, complete with:

- Employee creation
- Dynamic querying
- Hierarchical filtering
- In-memory transaction control (`commit`, `rollback`, `flashback`, `purge`)
- Oracle-style access restrictions and error handling

No actual database connectivity is required — everything runs in memory for fast prototyping and educational purposes.

---

## ⚙️ Features

| 🚀 Feature                     | 📝 Description                                                       |
|-------------------------------|----------------------------------------------------------------------|
| ➕ **Add Employees**           | Add employee data with ID, job, department, manager, etc.           |
| 🔐 **Login Simulation**        | Requires authentication before accessing or modifying data          |
| 🔍 **Search by Job**           | Case-insensitive job title search                                   |
| 🏢 **Search by Department**    | Filter employees by department number                               |
| 💰 **Search by Salary**        | Compare using `<`, `=`, `>` operators                               |
| 💸 **Commission Filter**       | View only employees with non-zero commission                        |
| 👑 **Find President**          | Display the employee with no manager (`managerno = -1`)             |
| 👥 **Employees Under Manager** | List all employees reporting to a given manager                     |
| 🔄 **Sort Employees**          | Sort employee records by fields like ID, salary, job, etc.          |
| 📈 **Salary Stats**            | Get max, min, 2nd max, and 2nd min salaries                         |
| ⚠️ **Oracle-Style Errors**     | Unauthorized access triggers `ORA-12154` error                      |
| 📦 **Rollback & Savepoints**   | Revert operations to previous state using savepoints                |
| ✅ **Commit Transactions**     | Finalize changes and prevent rollback                               |
| 🔁 **Flashback Recovery**      | Restore dropped data using `FLASHBACK`                              |
| ❌ **Purge Data**              | Permanently delete recovery data using `PURGE`                      |
| 🧪 **Drop Table Simulation**   | Drop in-memory table with option to `FLASHBACK` or `PURGE`         |
| 🔃 **Truncate View (Experimental)** | Print last state or simulate truncate operation                   |
| 🧠 **Dynamic Array Expansion** | Automatically resizes the internal database array as needed         |

---

## 🧰 Technologies Used

- 🟨 Java (Core)
- 🧠 Object-Oriented Programming (Encapsulation, Inheritance, Polymorphism)
- 💡 Custom Data Structures
- 💻 Console I/O

---

## 📁 Project Structure
```plaintext
JavaQueryLanguage/
├── DB/
│   ├── Employee.java          # 📌 Employee blueprint (POJO class)
│   ├── EmployeeDB.java        # 🧠 Core logic: (data storage,querying,sorting,filtering,transactions)
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
```
---

## ✍️ Author

**👤 Harshal Patil**  
📍 Pune, India
📧 [harshalpatil24082003@gmail.com](mailto:harshalpatil24082003@gmail.com)  
🔗 [LinkedIn](https://www.linkedin.com/in/harshal-patil24/)

---






