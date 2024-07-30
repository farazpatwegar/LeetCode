# Write your MySQL query statement below


select distinct p.email as Email from Person p , Person e where p.email=e.email and p.id!=e.id; 


