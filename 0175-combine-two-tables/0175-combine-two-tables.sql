# Write your MySQL query statement below

select firstName,lastName,city,state from Address a right join Person p on a.personid=p.personid;