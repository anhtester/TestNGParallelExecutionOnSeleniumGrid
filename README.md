## TestNG Parallel Execution On Selenium Grid 4

### ---------------- Download and Install --------------

Download Selenium Grid 4: https://www.selenium.dev/downloads/

(tải bản Latest stable version)

selenium-server-4.5.2.jar (updated 22/10/2022)

Đặt file selenium-server-4.5.2.jar vào thư mục nào đó và mở CMD tại thư mục đó lên

### ---------------------- Run default -------------------

Mở 1 hub với 1 node mặc định (port 4444)

> java -jar selenium-server-4.5.2.jar standalone

### -------------------- Run multi Node ----------------

Mở 1 hub với 3 node: (chạy 4 lệnh mở 4 CMD nhé)

> java -jar selenium-server-4.5.2.jar hub

> java -jar selenium-server-4.5.2.jar node --port 5556

> java -jar selenium-server-4.5.2.jar node --port 6667

> java -jar selenium-server-4.5.2.jar node --port 7778


**NOTE: Thực thi nhiều lệnh thì mở nhiều CMD**


### ------------Build Maven project------------------

**Run: SuiteAll.xml**


> Author: Anh Tester

> Website: https://anhtester.com
