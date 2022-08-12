# Write your MySQL query statement below

#select distinct w1.id,w1.temperature,w2.temperature,w1.recordDate,w2.recordDate
#from Weather as w1, Weather as w2
#where w2.temperature > w1.temperature


SELECT weather.id AS 'Id'
FROM weather
JOIN weather w 
ON DATEDIFF(weather.recordDate, w.recordDate) = 1
   AND weather.Temperature > w.Temperature

