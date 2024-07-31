DELIMITER $$
CREATE PROCEDURE sp_select_all_patient()
BEGIN
SELECT number, dept, operfee, hospitalfee, money
FROM patient
ORDER BY number DESC;
END $$
DELIMITER ;



DELIMITER $$
CREATE PROCEDURE sp_select_one_patient(
    IN v_number TINYINT
)
BEGIN
SELECT *
FROM patient
WHERE number = v_number;
END $$
DELIMITER ;



DELIMITER $$
CREATE PROCEDURE sp_update_patient(
    IN v_number TINYINT,
    IN v_code CHAR(2),
    IN v_days SMALLINT,
    IN v_age TINYINT,
    IN v_dept VARCHAR(20),
    IN v_operfee INT,
    IN v_hospitalfee INT,
    IN v_money INT
)
BEGIN
UPDATE patient
SET code = v_code, days = v_days, age = v_age, dept = v_dept, operfee = v_operfee, hospitalfee = v_hospitalfee, money = v_money
WHERE number = v_number;
COMMIT;
END $$
DELIMITER ;