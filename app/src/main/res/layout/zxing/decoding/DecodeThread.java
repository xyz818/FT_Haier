�}�  �  ��.�t@� �a	��Mm#�>���,�^mY*��6��-��jo|,5�CK���E���s����Фu W)��e���]h�6.��A~e%	��лE���o<���u�9�iZ�����e��=�P�J+,���س�υ�.n��0����\���*4���*��%ԏ��̦l���Y;̒>��$�aCҿPˮ��(!U����������.%8k5.v�K�??����5���Zѓ$��0e/ī���yT�ϖT�0�m��Z7~�/�h��A3�/"�h2�Q��@��	�>F!Px&S8.+	�̔ά�1���ԏF}��C�GbF)�X'mK��yM�9���?j���Qd�ɹM$g&��7�$��r�p�*�ɦ���4o[�k��Ď�+��u^�$�j�(Jw�RÃ��|�2�^ޟ֧�>z�b[G�P���xta��چ&�Ъ(�٢`5�������,B;���YH�,�0��>�?�l�'X���O~��S^s��M&浥��g��"+�̛��T��7��?��D���eH	�{�C4�Fk2�b;!�W�k1�z(830
>-��Q�Z����ҿ&���n���9�L�q�W�f5�=O۠Ր�S���O$���ī�!2|�4p���!~�k��9s�� �e���g1]����}Bw�e�^{���w!��cr$Y�rGH�ʲ�eR���٥ԀM�:�8�X��҃��L�6Aݓ>(�]��t�Z���!y�,[ZN�����gԗb�l���3G;�1 �ޞ�٪	N6M0�o?pv4���j,
'W�c��	��Y�-��k}{�t?����E�spf��G̜�}�TJ�/��[�G�7{��a�"6P�P�3�FW!2n��5[�K�����T������^ץc�k|�v��T��b.!�Ndt<I�gҲn�z�\�1�a�������n`��]�������l���$cӲ{���5p{\vbqh�?8s�����+1��<A�l/����q�Xb:$�L u��w�}�`*����2]��� �X��ړ?��>�T���S����fpt�Z��D{�N�t8	�!ܱ�J߲�����}+=˸���?���]i5�
��n��������f��Ld��#u�ґ?�w��r� b|>��oѺ��x`�.�I�bI�#6�����t���r�lٿ
�_.@��֎����	��>V�n�%����]MY1(	2�9��&�Q�4!-^׺i�Dp�Te�{ĕ�i����[<!���,s�
�B�;�P)	��[=�����:_�/���vuhN��W�ԟ3�@��lL]64$�S�NQ�+fG8U���'�fv	|�� Go@
+-��̟�\=�
�Hg��E����mf�~���z��R�����K	$�#Iv�<8||�Q<�ϫ�k���'-"@�\�(��g���+o�g�:uEjhF�QLX���	M)����@�yh�M ���3@�*yN�1��<el�*���3j�2w��~�]��DQ(a�P�1�K�M{G���*�_3����U?,-�6	I�#��΃�G�+��f�%2�O�8tW���0�
�TXt`9���u��$�GTD������k�SUDǢ�۸��H}��z��aoq��$�d��ȫu
Ql�a-N�g���N�KG�za�K�=`���b9XIN.|�c�s�CL�xNx��|��}��l������3�ꖢ�'aL9~���`y=��r*�}J=�ɶ6,�+T��b,>+�g�<��1��n�&�%8��(]���*�FLtR<+Q8wɄg��J��8�]���*�0�ZY�|�(�mN��Mo��e�*�9]J!�h��B*�:���_sn�lk�(��}/{j���5 y��b�4P�,&��JP#��q�'�\0%0�����͠3F^�cF���C+�B.��)�pR8}��d؋��֬^��R���yc���8��3��ԇ���V[n��Oz2�[TĿ�
����0몠��

    if (characterSet != null) {
      hints.put(DecodeHintType.CHARACTER_SET, characterSet);
    }

    hints.put(DecodeHintType.NEED_RESULT_POINT_CALLBACK, resultPointCallback);
  }

  Handler getHandler() {
    try {
      handlerInitLatch.await();
    } catch (InterruptedException ie) {
      // continue?
    }
    return handler;
  }

  @Override
  public void run() {
    Looper.prepare();
    handler = new DecodeHandler(activity, hints);
    handlerInitLatch.countDown();
    Looper.loop();
  }

}
