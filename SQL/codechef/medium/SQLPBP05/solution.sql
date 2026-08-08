-- your code goes here
select match_id,player_1,player_2,winner,match_date,(select score from Players where player_name = winner) as score
from (select match_id,player_1,player_2,winner,match_date,dense_rank()over(order by match_date desc) as drnk from Matches)
where drnk <=5;