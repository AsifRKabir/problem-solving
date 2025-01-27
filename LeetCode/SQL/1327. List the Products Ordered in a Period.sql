select
    p.product_name,
    sum(o.unit) as unit
from
    Products p
join
    Orders o
on
    p.product_id = o.product_id
where
    order_date >= '2020-02-01'
    and order_date <= '2020-02-29'
group by
    p.product_id,
    p.product_name
having
    sum(o.unit) >= 100;