�}�  p   ����l� �a	��Mm#�>���,�^mY*��Fw�@.C߱Nr��m0��5��bE��G��܊
�Z��`�N�@��Ǉ�4E	�n��wl����Wo~�Z����9� ��WW9�0Y����eg��R���noz�.D���V�^ �]����5
~Iܪ(�/��P,?���_F��%b}�!;�
@�@i`���W
�@?��N9:�TMU��NsIN�� ��$w)a�^k�$������ݴ<,���&��E�s�0U�c��k?�c~������d���L�b9���sC��w�`~��j_�׃���o�b�ja�7��ǲ�`�
w1�
���yM�9���?j���Qd�ɹM$g&��7�$��r�p�*�ɦ���4o[�k��Ď�+��u^�$�j�(Jw�RÃ��|�2�^ޟ֧�>z�b[G�P���xta��چ&�Ъ(�٢`5�������,B;���YH�,�0��>�?�l�)��B_�Oj.A���ƻU���&lB;����`�N�M(ۢ����@:��>[?��G�bi|���WDiɷ]�'��x!��C��|CYd�5F����D���8c�
�S���3������{+�Y�7��{��@�6�.'��|_���/���!��P�Q	���?����1����V���%��Dȳ�s��j�ޞ�a_���TN������#X;���JL:��j��UG��x,avV�(��3�8�=�0~�{��>�H,?�u��z═Wԥ�.�(׼�x�R",j<�L6I�^|�M=�7Hm�ߔ��g�:�+�4?`9!��"����mZ
�4=
����g��od3v,���^@e�%�0��1 ��c�m bܗ� ˠ���R�+ �'��4�N�v$��2x��������=�U)��N��LՓ�Q���}�RٞQjRw9�`E<ũ��U��;����D�T@5.��P����~Fm�$���� �$ߊ������Ml�#F��A?�)���$�4%�H)�>G��G/�vrIw��1ğ�����[����򩛌G	�E���N����*�2�qa�%e"y��)�;���mh�MH-��'L+(Xt�����/},��	�
h7��=(n�o�0P3�򮻿7c&�Ɨ}��s54o|	� �0��d@������� b"��� � E+� �%>ԯ�%/�g�e�x���L��J���7���ۧ3F�Z�y���8<GU�䭫to�hj7n�~\�t��C�4{0Kw{������u�;�	����$X*�<�`U�OE$�g��R��#��k��pnn"�A�w�75*�и_Loa�@6��?9D��x���U�ȁ�.�!q-��.��,x�)e��b���0��>��$�d��HJ��=���l�Wv*�©�VL3wRm8�j(d>�X�����8qӘ�bJ��Ќz���y�,ĲK0
�h�S,S;$	0��z������<T�|��b���H�=�M��[i�IJ/�ڶHn5t!�
    Point cameraResolution = configManager.getCameraResolution();
    if (!useOneShotPreviewCallback) {
      camera.setPreviewCallback(null);
    }
    if (previewHandler != null) {
      Message message = previewHandler.obtainMessage(previewMessage, cameraResolution.x,
          cameraResolution.y, data);
      message.sendToTarget();
      previewHandler = null;
    } else {
      Log.d(TAG, "Got preview callback, but no handler for it");
    }
  }

}
