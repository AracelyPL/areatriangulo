<html>
    <head>
        <title>Area del triangulo</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div>obtener area
            <form action="/areatriangulo/servlets/servletArea" method="get">
                <label for="base">Base:</label>
                <br>
                <input type="number" name="base" required value="0" min="0" step="1" />
                <br>
                <label for="altura">Altura:</label>
                <br>
                <input type="number" name="altura" required value="1" min="1" step="1" />
                <br>
                <label for="operation">Operation:</label>
                <br>
                <select name="operation">
                  <option value="AREA">*</option>
                </select>
                <input type="submit" value="calcular" />
              </form>           
        </div>
    </body>
</html>