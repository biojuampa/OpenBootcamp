import hashlib


def encode(psw):
    h = hashlib.md5()
    h.update(psw.encode())
    return h.hexdigest()


while True:
    password = input('Dime tu password (entre 6 y 12 caracteres): ')
    if 6 <= len(password) and len(password) <= 12:
        md5 = encode(password)
        print(f'md5 = {md5}')
        break
    else:
        print('¡Longitud de password incorrecta!')
