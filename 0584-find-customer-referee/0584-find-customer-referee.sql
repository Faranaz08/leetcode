# Write your MySQL query statement below
SELECT  name FROM Customer
Where  referee_id!=2 OR referee_id is NULL;

/*SOLUTION 1  - MOST EFFICIENT 
WHERE 
    IFNULL(referee_id,0) <> 2;
    
#SOLUTOIN 2    
WHERE
    referee_id != 2 OR referee_id is NULL

#SOLUTION 3   
WHERE
    COALESCE(referee_id, 0) <> 2
    */