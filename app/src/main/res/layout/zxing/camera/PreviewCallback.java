�}3  a  ��= [ F# �a	��Mm#�>���,�^mY*��Fw�@.C߱Nr��m0��5��bE��G��܊
�Z��`�N�@��Ǉ�4E	�n��wl����Wo~�Z����9� ��WW9�0Y����eg��R���noz�.D���V�^ �]����5
~Iܪ(�/��P,?���_F��%b}�!;�
@�@i`���W
�@?��N9:�TMU��NsIN�� ��$w)a�^k�$������ݴ<,���&��E�s�0U�c��k?�c~������d���L�b9���sC��w�`~��j_�׃���o�b�ja�7��ǲ�`�
w1�
���yM�9���?j���Qd�ɹM$g&��7�$��r�p�*�ɦ���4o[�k��Ď�+��u^�$�j�(Jw�RÃ��|�2�^ޟ֧�>z�b[G�P���xta��چ&�Ъ(�٢`5�������,B;���YH�,�0��>�?�l�'X���5~���>x��c���Фg��B�^�5a,]&P:W�xv�3������~QϞ�.z K��m��4���r���iB��!��۠݌U��h�d��xy�4�z���..<���xS1�J��B�*[��x��g�2O������y��Ax��9s���r%�Y���MXT����2Fw�l�gg���s��_,T�OT�μ�0,���ƴ��(�8�>�C��ƈ��	�.?��J:#�h��e�[���+/�1L (�4؇��g�S���2G�-/��Ҭ��m@u^>�G c=7���?c#)FO�i�������new$�z5��=�Tw,%��#ł�P� M����!�3VW��u�+)P�U��NAs2A���4Y�Q�����\������R��a�o^�q����b.!�Ndt<I�gҲn�z�\�1�a�������n`��]�������l���$cӲ{���5p{\vbqh�?8s�����+1��<A�l&����iuƉ���f6�n,T�Y%7�����L�_-��М~��)������!v�!��#�^���Y�dџ����M���|:=)!��|nUo�X�}X���'���n�KJxb�{Y`�p^:��oO�Z�ޫ{���F�>�Ù!k��4p?̤����)Hr
����ҩs���;��*ƖQ0�py�@�C�_U`q	��jù	{&������ܴ'ҷd�I1�~?�t(��YB�S2k9]��K��Jۈu�$��n�x����d�}f�I�5��6ͤ��⵶�\�0,�-mP�'` ����.���|kɸ��N��J{%ah�"A�b�1OdƄkh���$�a����bt���eD«�ϰ����+�/�y�!��� ��Ib^i�ɮ#)���U�6)32>J����E�K���3䖆�~�����r �Wp΍�(�X���j��ړ`��4d1j���G8��ZK@"]����PҴ���&���%�"��dz|Zf��C��P�coid onPreviewFrame(byte[] data, Camera camera) {
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
