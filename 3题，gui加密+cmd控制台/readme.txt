弹性课程-B部分
在本部分中，您将开发一个汽车租赁管理系统来管理汽车、客户、员工和租赁
合同的信息。
CW3B部分将贡献总分数的50%。
该系统有以下几个类：
（1）创建一个类“汽车”来表示汽车租赁管理系统中的汽车信息。它应该
至少有3个成员变量的汽车Id，品牌名称和座位的数量。
（2）创建一个从类“Car”继承来的类“Cruck”。它至少有一个新的成员
变量“载重能力”来表示卡车的载重能力。
（3）创建一个类“客户”来表示客户信息。它至少有3个成员变量，包括客
户Id、客户名称和性别。性别应该是一种具有“男性”和“女性”两个
值的枚举类型。
（4）创建一个类“经理”来代表汽车租赁管理系统的经理。它至少有5个成
员变量，经理Id，姓名、性别，登录名和密码。
（5）创建一个类“租赁信息”来代表客户的租赁信息。它至少有3个成员变
量：汽车Id、客户Id和租赁天数来代表客户的租赁记录。
（6）从A部分复制类“加密”，它可用于加密和解密管理器的密码。
（7）创建一个类“文件utils”，可以用来创建纯文本文件，分别保存客户
、经理、汽车、卡车和租赁记录的对象。此外，它还应该提供从这些纯
文本文件中检索对象的方法。为了实现这一点，客户、经理、汽车、卡
车和租赁信息的类别应该实现一个可序列化的接口。
（8）创建一个类“数据访问”，它调用fileutils类来创建并将对象（客户
、经理、汽车、卡车和租赁信息）保存到5个不同的文件中。该类应该使
用ArrayList来保存从文件中检索到的对象。此外，它还可以根据对象的
id进行搜索和返回对象。例如，方法“CargetCarById(字符串carId)”
可以通过汽车Id搜索和返回一个汽车对象。
（9）创建一个类“Q3”，并在其主方法中实现以下功能。
a.创建如下操作菜单：
7
b.用户可以输入一个数字来运行一个相关的功能。
c.当用户输入1时，用户就可以输入客户的Id、名称和性别来创建一
个客户对象，并将其附加到一个客户数据文件中。用户可以连续
创建几个客户，直到输入“-1”。下图显示，用户创建了2个客户
对象，这些对象也被保存到客户数据文件中。
添加汽车、卡车、经理和租赁信息的操作类似于添加客户。
8
d.当用户输入7时，应列出并打印如下。
当没有对象时，它应该打印出如下消息，让用户知道没有对象。
列出汽车、卡车、管理器和租赁信息对象的操作类似于列出学生
对象。
e.当用户输入13时，用户可以输入客户Id来搜索并打印出相关的客户
对象。如果该客户对象不存在，则请打印出一个字符串，以显示
未找到该客户对象。
搜索汽车、卡车、经理和租赁信息对象的操作类似于搜索客户对
象。但是，用户应该同时输入客户Id和汽车Id来搜索汽车或卡车
租赁对象。
（10）还有其他要求如下：
a.该程序可以连续运行，直到用户输入0以退出。
b.在创建对象时，您应该检查并避免使用重复的id。
c.异常应被正确地捕获和处理。
d.需要对方法和类的注释。
9
调整课程-C部分
在C部分中，您将完成该部分中的程序的设计和文档
B.
cw3C部分将占总分数的15%。
Javadoc评论
在类“租赁信息”中编写适当的Javadoc注释，生成Javadoc
并转换并提交PDF格式的Javadoc。（5分）
类图
在一个PDF文件中完成类汽车、卡车和文件的UML类图。（10分）
*javadoc和类图应该放入一个PDF报告中提交。
10
调整课程-附加注释
提交说明
您应按照下面的提交步骤将您的文件提交给
学习购物中心。
（1）你应该在2022年7月28日之前完成并提交剩余的课程作业。
（2）将A部分的整个NetBeans项目文件夹压缩成一个压缩文件，并使用A部
分的提交链接将其上传到学习购物中心。
（3）将B部分的整个NetBeans项目文件夹压缩成一个压缩文件，并使用B部
分的提交链接将其上传到学习购物中心。
（4）将C部分的所有文档压缩成一个压缩文件，并使用C部分的提交链接将
其上传到学习购物中心。
延迟提交：标准的大学政策延迟提交将适用：5%的总分数的组件应当扣除评估
标记提交日期后的每个工作日，最多五个工作日，只要这不减少标记低于通过
标志（40%）。逾期五个工作日以上的提交将不予接受。 论剽窃
这门剩余的课程作业是个人作业。剽窃(e。g.从其他来源复制材料而未经适当
承认)是一种严重的学术犯罪。剽窃和共谋将不会被容忍，并将按照《大学学术
诚信行为守则》进行处理。个别学生可能会被邀请亲自解释他们的代码的部分
，如果他们不能演示
理解了代码后，不会表扬代码的那一部分。这是剩余课程任务表的结
束。
11


1
CPT105 Introduction to Programming in 
Java 2021-2022 S1
Resit Coursework Task Sheet
Overview
Resit coursework consists of three parts: Part A, B, and C.
The learning outcomes of CPT105 Intro to Programming in Java include equipping you 
to understand and appreciate the principles of Object-Oriented Programming. We 
also want you to be competent to design, write, test and debug programs in Java. Part 
A and Part B are designed to start you in those directions, where you will write your 
own classes and methods.
In addition, you are also expected to be aware of the design and the good 
documentation of a finished program. Part C will help you achieve that goal.
The resit Coursework is 100% of your final grade – it is an individual project.
In addition, we may ask you to give a short presentation/Q&A to show the authenticity 
of your project.
2
Resit Coursework – Part A
In Part A, you are required to write a GUI program to simulate data encapsulation
when we transfer data via the Internet. You should follow the description to produce 
the correct output. It is further divided into two parts: Part A.1 and A.2.
CW3 Part A will contribute to 35% of the total marks.
Part A.1 DataPacket (12 marks)
We usually transfer encrypted data packets via the Internet to protect the privacy of 
original data. Usually, an encrypted data packet is composed of several components: 
the frame header, frame tail, length of data and encrypted data. Table 1 below shows 
the detailed packet structure used in the question.
Table 1. Packet structure
Header Data length Encrypted data segment Tail
2 Bytes 1 Byte N Bytes 2 Bytes
In Table 1, we use 2 hexadecimal constants of “AAAA” and “BBBB” to represent the 
header and tail of a data packet (Header and Tail columns), respectively, one byte to 
represent the length of the encrypted data. We should encrypt the original data and 
encapsulate the encrypted data into the data segment and convert the data packet to 
a hexadecimal string before we send the data via the Internet. The procedure of the 
data encapsulation is as follows:
(1) Encrypt the data string into an encrypted string.
(2) Calculate the length of the encrypted string.
(3) Convert encrypted string into a hexadecimal value.
(4) Combine the header, data length, encrypted data and tail into a data packet.
For example, before we send a string “123” to a remote user via the Internet. The 
string should be encrypted and encapsulated into a data packet of a hexadecimal 
string “AAAA0c44464567552f507a6e4f513dBBBB”. “AAAA” and “BBBB” are the 
header and tail of the data packet, “0c” represents the length of encrypted data (12 
bytes), “44464567552f507a6e4f513d” is the hexadecimal string of each character in 
the encrypted data “DFEgU/PznOQ=”. We defined a class “Encryption” to help you 
encrypt or decrypt strings as follows:
Please follow the steps below to complete the task:
(1) Create an empty java project. The project name should be “Resit_1”.
(2) Create a class “Encryption” in your project.
(a) Copy the code from the figure above into your Encryption class; 
(b) Change the encryption key to your student id. 
(3) Create a class “DataPacket”. 
(a) Define a method “strToHex(String str)” to convert a common string into 
a hexadecimal string. For example, convert a string “123A” to 
“31323341”.
(b) Define a method “convertToDataPacket(String data)”, which can 
encrypt a string into a new encrypted string and encapsulate it into a 
data packet and return a hexadecimal string, as Table 1 shows. For 
example, encrypt a string “123” into a data packet string “AAAA0c
44464567552f507a6e4f513dBBBB”.
(c) Define a method “getDataFromDataPacket(String hexData)”, which 
can retrieve the original data from a hexadecimal string of a data 
packet. The method should check the header and tail of the packet and
the length of the data. For example, retrieve the original data string 
“123” from the data packet “AAAA0c44464567552f507a6e4f5
13dBBBB”
(4) Create a class “Q1” and achieve the following functions in its main method.
(a) Create a frame window as the following;
3
(b) Create a DataPacket object in the main method;
(c) When users click “Data to packet” button, the string in the raw data 
text field can be encrypted and showed in the encrypted data text field. 
The encrypted data can be encapsulated into a data packet string, and 
the data packet is shown in the data packet text field;
(d) When users click “Packet to data” button, it can retrieve the encrypted 
and original data strings from the data packet field and show them in 
the raw data and encrypted data text fields, respectively. 
Part A.2 MultiDataPacket (23 marks)
Sometimes, we need to transfer several data within one data packet to improve data 
transmission efficiency. For example, if we send three strings of “ABC”, “EFG” and “HIJ”
in one data packet, the hexadecimal value of the data packet is 
“AAAA0c685279554936796637696b3dBBBBAAAA0c61427a616c76474133366b3dBB
BBAAAA0c5861346a4970775755756b3dBBBB”. The sub string of “AAAA0c68527955
4936796637696b3dBBBB” is the hexadecimal data of the first encrypted string “ABC”. 
The sub strings of “AAAA0c61427a616c76474133366b3dBBBB” and 
“AAAA0c5861346a4970775755756b3dBBBB” are the hexadecimal data for 
encrypted strings of “EFG” and “HIJ”, respectively. In addition, you should check the 
validation of the data packet before we retrieve data from it. If the data packet is not 
valid, you should throw an exception. Please follow the steps below to complete the 
task.
(1) Create an exception class “MyException”, which is inherited from “Exception”.
(a) Create a constructor “MyException (String message)” to create an 
exception object with a string of the exception message.
(b) Override the method “toString()” to return the message string.
(2) Create a subclass “MultiDataPacket” based on the base class “DataPacket”.
(a) Create an overloading method “String[] strToHex(String[] str)”, which 
can convert an array of common strings to an array of hexadecimal 
strings.
(b) Create an overloading method “String convertToHexDataPacket
(String[] data)”, which can convert an array of common strings to a 
MultiDataPacket with a single hexadecimal string.
4
(c) Create a new method “String[] getMultiDataFromHexDataPacket
(String hexData)” to retrieve and return an array of strings from the 
MultiDataPacket string “hexData”. The method should validate the 
header, tail and length for each data packet in the string “hexData” and 
throw a “MyException” exception if any validation is failed.
(3) Create a class “ImgePanel”, which is inherited from class “JPanel”.
a. Define a public constructor to create an ImagePanel object with an
image file name.
b. Override the method “paintComponent (Graphics g)” to set a 
background image for the ImagePanel object.
(4) Create a class “Q2” and achieve the following functions in its main method.
(a) Create a frame window as below;
You should list your student Id on the top of the window, set a 
background image for the frame window, and set labels’ font size to 15 
and font color to red. You can use any image you like.
(b) Create a MultiDataPacket object in the main method; 
(c) Create an ImagePanel object with a background image and add it to the 
Frame window as the main container of other components.
(d) Users can input strings into the first 3 text fields ( raw data 1~raw data 
3). When users click the “Convert to multi packet” button, strings in the 
3 text fields can be encrypted and encapsulated into a hexadecimal 
string and shown in the “multi data packet” text field.
(e) When “Retrive data” button is clicked, users can retrieve all the
separate data from the “multi data packet” text field and show them in 
the first 3 text fields (Raw data 1~Raw data 3), respectively. 
(f) You should use a message dialogue to show any exceptions raised in 
your program. Below is an example for your reference.
5
6
Resit Coursework – Part B
In this part, you will develop a car rental management system to manage information 
of cars, customers, staff and rental contracts. 
CW3 Part B will contribute 50% of the total marks.
The system has several classes as follows:
(1) create a class “Car” to represent the car information of the car rental
management system. It should have at least 3 member variables of car Id, 
brand name and the number of seats. 
(2) Create a class “Truck” inherited from the class “Car”. It has at least 1 new
member variable of “loadCapacity” to represent the load capacity of the truck. 
(3) Create a class “Customer” to represent customer information. It has at least 3
member variables of customer Id, customer name and gender. Gender should 
be an enum type with two values of “MALE” and “FEMALE”.
(4) Create a class “Manager” to represent the manager of the car rental
management system. It has at least 5 member variables of manager Id, name, 
gender, login name and password.
(5) Create a class “RentalInfo” to represent the rental information for customers. 
It has at least 3 member variables of car Id, customer Id and rental days to 
represent a rental record for a customer.
(6) Copy the class “Encryption” from Part A, which can be used to encrypt and 
decrypt the manager’s password. 
(7) Create a class “FileUtils”, which can be used to create plain text files to save 
objects of customers, managers, cars, trucks and rental records, respectively.
In addition, it should provide methods to retrieve objects from these plain text 
files. To achieve this, classes of customer, manager, car, truck and rental 
information should implement an interface of Serializable.
(8) Create a class “DataAccess”, which invokes FileUtils class to create and save 
objects (customers, managers, cars, trucks and rental information) into 5
different files. The class should use ArrayList to save objects retrieved from 
files. In addition, it can search and return objects according to the object’s id. 
For example, the method “Car getCarById(String carId)” can search and return 
a car object by the car Id. 
(9) Create a class “Q3” and achieve the following functions in its main method.
a. Create an operation menu as follows:
7
b. Users can input a number to run a related function. 
c. When users input 1, then users can input customer’s Id, name and
gender to create a customer object and append it into a customer data 
file. Users can continuously create several customers until “-1” is 
inputted. The following picture shows that the user creates 2 customer
objects, which are also saved into the customer data file. 
Operations to add a car, truck, manager and rental information are 
similar to that of adding a customer.
8
9
d. When users input 7, all the customer objects should be listed and 
printed out as follows.
When there is no object, it should print out a message as follows to let 
users know that there is no object.
Operations to list car, truck, manager, and rental information objects 
are similar to that of listing student objects.
e. When users input 13, then users can input the customer Id to search 
and print out the related customer object. If the customer object does 
not exist, then print out a string to show that the customer object is 
not found.
Operations to search a car, truck, manager and rental information
object are similar to that of searching a customer object. However,
users should input both customer Id and car Id to search for a car or 
truck rental object.
(10) There are other requirements as follows:
a. The program can be continuously run until users input 0 to exit.
b. You should check and avoid duplicate Ids when you create objects. 
c. Exceptions should be caught and handled properly.
d. Comments for methods and classes are required.
10
Resit Coursework – Part C
In Part C, you will complete the design and the documentation of the programs in Part 
B.
CW3 Part C will contribute to 15% of the total marks.
Javadoc Comment
Write appropriate Javadoc comments in class “RentalInfo”, generate the Javadoc 
HTML from that and convert and submit the Javadoc in PDF format. (5 marks)
Class Diagram
Complete the UML class diagrams of class Car, Truck and FileUtils in one PDF file. (10
marks)
* The javadoc and class diagrams should be put into one
single PDF report for submission. 
Resit Coursework – Additional Notes
Submission instructions
You should follow the submission steps below to submit your documents to the 
Learning Mall.
(1) You should complete and submit the resit coursework before July 28, 
2022.
(2) Zip the Whole NetBeans project folder of Part A into one zipped file and upload
it to the learning mall using the Part A submission link.
(3) Zip the whole NetBeans project folder of Part B into one zipped file and upload
it to the learning mall using the Part B submission link.
(4) Zip all the documents of Part C into one zipped file and upload it to the learning
mall using the Part C submission link.
Late submissions: The standard University policy on late submissions will apply: 5% 
of the total marks available for the component shall be deducted from the assessment 
mark for each working day after the submission date, up to a maximum of five working 
days, so long as this does not reduce the mark below the pass mark (40%). Submissions 
more than five working days late will not be accepted.
On Plagiarism
This resit coursework is individual work. Plagiarism (e.g. copying materials from other 
sources without proper acknowledgement) is a serious academic offence. Plagiarism 
and collusion will not be tolerated and will be dealt with in accordance with the 
University Code of Practice on Academic Integrity. Individual students may be invited 
to explain parts of their code in person, and if they fail to demonstrate an 
understanding of the code, no credit will be given for that part of the code.
This is the end of resit Coursework Task Sheet.
11