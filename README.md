pfSpringMongoNoSql
==================

INFORMAL


Bu yazilim linux mintte netbeans 8.0 Ide java 7 ile yazilmistir.Database tarafinda nosql mongo var.
Mongo yu mongodb-1ogen repositoryinisini apt/ altina ekleyerek kurabilirsiniz.
Daha sonra mongoyu calistirip use JavaBeat diyerek db yi  olusturmaniz gerekmekte.
Ardindan giti bilgisayariniza kurun.sudo apt-get install git derseniz direk kurulur.
Terminali acin ve git clone <url-path> vererek projeyi bilgisayariniza indirin.Ben tomcat 8.0 da yaptim.Sizede bunu tavsiye ederim.
Aldiginiz git projesinde ilk yapacaginizi sirasiyla mvn clean,mvn install -Dmaven.skip.test ve mvn package komutlarini calistirmak.
Pom xml icindeki tanimli butun kutuphaneler(mongo java driver,primefaces,spring mvc etc..) hepsi kullaniminiz icin pc nize inecektir.

