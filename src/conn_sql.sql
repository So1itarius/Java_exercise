
SELECT book_name,fio FROM (books JOIN conn USING (b_id)) JOIN readers USING (r_id);

