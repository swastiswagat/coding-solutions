-- your code goes here
select player_name , score 
from ( select player_name , score , dense_rank()over(order by score desc) as drnk 
from players)
where drnk <=3 ; 