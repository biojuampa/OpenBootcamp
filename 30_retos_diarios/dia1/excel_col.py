import pandas as pd


try:
    df = pd.read_excel('users-emails.xlsx')
except:
    print('Hubo un error leyendo el archivo.')

emails = set(df.iloc[:, 1])
print(*emails, sep='\n')
