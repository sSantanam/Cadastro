<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Seleção de Data</title>
    <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <script src="https://code.jquery.com/jquery-3.6.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <script>
        $(function() {
            $("#datepicker").datepicker({ dateFormat: 'yy-mm-dd' });
        });
    </script>
</head>
<body>

    <h2>Seleção de Data</h2>

    <p>Selecione uma data: <input type="text" id="datepicker"></p>

</body>
</html>