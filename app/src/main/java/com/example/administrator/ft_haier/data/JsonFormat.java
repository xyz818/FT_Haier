�}�  �C  1�MKg^� �a	��^m#w!��z(fF<G��D8��5�p�K�/ih�?���*	����[��|X���T�Ԧ��rn�~P��^�ր�D�=�� ���|9.&A
E��t{F��~���"���|m��I�	��q ���t�G��*�!5��a�	���؜-���K�]�D�J�k�YL
��Q>;ѿ�ݔ��ji�_�D.UV,�W�V������#�ֱ��-tnH�=!5n,�}7J���b~���k!#W?L�ڽ�x�B2�������ˤ�7�����~���1�.q�!9��4 C�N�����ٱ7�x�m�^Ez�Rl4`7��;�$�dc�@$CxZW���K�eh���r�gͯ'9�d�ɹM$g&��7�$��r�p�*�ɦ���4o[�k��Ď�+��u^�$�j�(Jw�RÃ��|�2�^ޟ֧�>z�b[G�P���xta��چ&�Ъ(�٢`5�������,B;���YH�,�0��>�?�l�&5������ۋR3^,Q6o�Xr��*tZ�fm{���:Z�5��'��F�~��y�+��R�{z����޶r�V��i5շպ��΁9m�x<u�w�p���H-�w�����6���XGy���+^6�Il ����Ux$����bS�>�÷��*Wz��Q��L)�A����E!V��X��"���a}\��e����No�O��n���c�?�_JS�N���@��o/c�/���|X�q����>um�(da���s
Wv�"Z.�Lĝ��b[$���mFNZ���Z���5�>��a�n���
y��h%� iՓ�ԑ�b��-�ò1�5� ���b>��-��wHx�ش��-!'��T�na.�o�A�k�

L���hd`G?898pl��د�� l�ӟ��دߛĔ!�0��s�1S;�FU�f+�6��3fG�x􍨑G�e�K��kH�<��Ƣ;����LTE����D~�"?w�^�t��%h��,�w�|
зH��,l�lD(�V����K�B��mOE�Ю�{?bĠ}�;�ڶC�H��%�|]�;8��_�؏wY�OP�h�1Ո]�:>��y���JX<S@��ץ�#����d1��j7���Cf����p*�?N�R�`?��Q�C�xsR���{)b4��3v5���	�p�g[�ݯ(O����Z}�U��GNi^ +�-��{�?�lH2��}N��hCa�`aW�|_f�P�ń���ݢP��A�5V3%U#����GPjl�c���*�Q�K���'PE��F�xR>9��|�Q1�V�y�}E@�˘Cn�`>�_6�>b�T��.�&	g�^�J����t�Ͻ�4���B�G�4��?�������^&��SK�G�J���]0���چě?�!Q�h�i���ԓ�сQ�[�ћ����3��IXWnQ&�&�����-��S������b��̋7\K�V�%�zT���p��!}��ҋ:����#�&��7�Y{m�����ל��f&�sgDownTopic("/downstream/" + json.getString("DeviceId"));
            cc.setDeviceId(json.getString("DeviceId"));
            cc.setServerAddress(json.getString("ServerAddress"));
            cc.setInterfaceAddress(json.getString("InterfaceAddress"));
            cc.setKey(json.getString("Key"));
            cc.setSleeptime(json.getInt("SleepTime"));

            return cc;
        } catch (Exception e) {

            e.printStackTrace();
            return cc = null;
        }
    }

}
