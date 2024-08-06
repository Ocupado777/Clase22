def convertir_a_12_horas(hora_24):
    try:
        horas, minutos = map(int, hora_24.split(':'))
        
        if not (0 <= horas < 24 and 0 <= minutos < 60):
            raise ValueError("La hora o los minutos están fuera del rango válido.")
        
        periodo = "AM" if horas < 12 else "PM"
        
        if horas == 0:
         horas_12 = 12
        elif horas > 12:
            horas_12 = horas - 12
        else:
            horas_12 = horas
        
        if horas == 12:
            horas_12 = 12
        
        hora_12_formateada = f"{horas_12}:{minutos:02d} {periodo}"
        
        return hora_12_formateada
    except ValueError as e:
        return str(e)

hora_24 = input("Ingresa el tiempo en 24 horas (HH:MM): ")
hora_12 = convertir_a_12_horas(hora_24)
print("Formato en 12 horas:", hora_12)
