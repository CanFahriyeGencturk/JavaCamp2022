/*Select*/
SELECT ContactName Ad,CompanyName SirketAdı,City  Sehir FROM customers;

Select * from Customers where City = 'London';

Select * from  products where CategoryID = 1 or CategoryID = 3 ;

/*Case insensitive*/
SElEct * from  products where CategoryID = 1 and UnitPrice >= 18 ;

select * from products order by ProductName;
select * from products order by CategoryID;

select * from products order by CategoryID , UnitPrice;

select * from products order by UnitPrice asc; /* ascending - artan*/
select * from products order by UnitPrice desc; /* descending - azalan*/

select * from products where CategoryID=1 order by UnitPrice desc;

/*****GROUP BY******/
Select count(*) from products; /*tüm satırları say demektir*/
Select count(*) Adet from products; /*Adet-> Alias*/
Select count(*),ProductName from products; /*Hata alırız çünkü count sadece sayı verir*/
Select count(*) from products where CategoryID =2; /*' numaralı kategoride kaç adet ürün var demektir , sayı dönüşü verir*/

/*Hangi kategoride kaç farklı ürünümüz var =*/
select CategoryID,count(*) from products group by CategoryID; /* Dataların içine bak butün kategorileri tekrarlamamayacak sekilde kaç adet olduğunu getir*/

select CategoryID,count(*) from products group by CategoryID having count(*) <10; /*10 dan az ürün bulunduran kategorileri getirir*/

select CategoryID,count(*) from products where UnitPrice>20 group by CategoryID having count(*) <10; /*UnitPrice 20 den büyük olanları alıyoruz*/


/****** JOIN *******/
select *
 from products inner join categories
 on products.CategoryID = categories.CategoryID;

select products.ProductID, products.ProductName, products.UnitPrice, categories.CategoryName
 from products inner join categories
 on products.CategoryID = categories.CategoryID;
 
 /* DTO -> Data Transformation Object */
 
 select products.ProductID, products.ProductName, products.UnitPrice, categories.CategoryName
 from products inner join categories
 on products.CategoryID = categories.CategoryID
 where products.UnitPrice>10; /*Fiyatı 10 dan büyük olanları Category ismiyle beraber getirir*/
 
 /*****İNNER JOIN****/
 /*Sadece iki tabloda da eşleşenleri getirir. Eşleşmeyen data varsa onu getirmez*/

SELECT count(*)  FROM  northwind.`order details` ;
 
 SELECT * FROM products p inner join northwind.`order details` od
 on p.ProductID = od.ProductID;
 
 /*Hiç satış yapılmayan ürünler yani solda olup sağda olmayan ürünler-> ürünler tablosunda var fakat satış yapılmayan*/
SELECT count(*) FROM products p left join northwind.`order details` od 
 on p.ProductID = od.ProductID;
 
 select count(*) from customers c inner join orders o 
 on c.CustomerID = o.CustomerID; /*830*/
 
select * from customers c left join orders o 
 on c.CustomerID = o.CustomerID
 where o.CustomerID is Null; /*834 -> Solda olup sağda olmayan yani müşteri var fakat sipariş hiç yapmamış*/
 
 SELECT * FROM products p inner join northwind.`order details` od 
 on p.ProductID = od.ProductID
 inner join orders o 
 on o.OrderID = od.OrderID;




















