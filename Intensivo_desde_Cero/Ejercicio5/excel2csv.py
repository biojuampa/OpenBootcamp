import pandas as pd


excel_file = input('Dime un archivo de excel: ')
csv_file = f"{excel_file.split('.')[0]}.csv"
try:
    df = pd.read_excel(excel_file)
    df.to_csv(csv_file, index=None, header=True)
    print(f'¡Archivo {excel_file} convertido correctamente a {csv_file}!')
except:
    print(f'¡Hubo un error convirtiendo el archivo {excel_file}!')
